package com.example.vims_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.vims_backend.dto.ApproveProposalRequestDTO;
import com.example.vims_backend.dto.ProposalResponseDTO;
import com.example.vims_backend.dto.UserViewDTO;
import com.example.vims_backend.entity.Proposal;
import com.example.vims_backend.service.ProposalService;
import com.example.vims_backend.service.UserService;

@RestController
@RequestMapping("/api/officer")
public class OfficerController {
    @Autowired
    private UserService userService;
    
    @Autowired
    private ProposalService proposalService;

    @GetMapping("/users")
    public List<UserViewDTO> getAllUsers() {
        return userService.getAllUsersForAdmin();
    }
    
    @GetMapping("/proposals")
    public List<ProposalResponseDTO> getAllProposals() {
        return proposalService.getAllProposals();
    }
    
    @PutMapping("/proposals/{id}/approve")
    public ResponseEntity<String> approveProposal(@PathVariable int id, @RequestBody ApproveProposalRequestDTO request) {
        Proposal updated = proposalService.approveProposal(id, request);
        if (updated != null) {
            return ResponseEntity.ok("Proposal approved. Status: " + updated.getStatus());
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Failed to approve proposal.");
        }
    }
}
