package com.example.vims_backend.controller;

import com.example.vims_backend.entity.Proposal;
import com.example.vims_backend.service.ProposalService;
import com.example.vims_backend.service.VehicleService;
import com.example.vims_backend.entity.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProposalController {

    @Autowired
    private ProposalService proposalService;

    @Autowired
    private VehicleService vehicleService;

    // Show Proposal Form
    @GetMapping("/proposalPage")
    public String proposalForm(@RequestParam("userId") int userId, Model model) {
        List<Vehicle> vehicles = vehicleService.getVehiclesByUserId(userId);
        model.addAttribute("userId", userId);
        model.addAttribute("vehicles", vehicles);
        return "proposal.jsp";
    }

    // Handle Proposal Submission
    @PostMapping("/submitProposal")
    public String submitProposal(@ModelAttribute Proposal proposal, Model model) {
        proposalService.submitProposal(proposal); 
        model.addAttribute("message", "Proposal submitted successfully!");
        return "userhome.jsp";
    }


    // Officer approves and adds quote
    @PostMapping("/approveProposal")
    public String approveProposal(@RequestParam int proposalId, @RequestParam double quoteAmount, @RequestParam int officerId, Model model) {
        if (quoteAmount <= 0) {
            model.addAttribute("error", "Quote amount must be positive.");
            return "officerhome.jsp";
        }

        return "officerhome.jsp";
    }

}
