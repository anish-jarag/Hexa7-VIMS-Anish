package com.example.vims_backend.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int documentId;

    private int proposalId;

    private String docType;

    private String fileUrl;

    private LocalDateTime uploadedAt = LocalDateTime.now();

    // Constructors
    public Document() {}

    public Document(int documentId, int proposalId, String docType, String fileUrl, LocalDateTime uploadedAt) {
        this.documentId = documentId;
        this.proposalId = proposalId;
        this.docType = docType;
        this.fileUrl = fileUrl;
        this.uploadedAt = uploadedAt;
    }

    // Getters and Setters
    public int getDocumentId() {
        return documentId;
    }

    public void setDocumentId(int documentId) {
        this.documentId = documentId;
    }

    public int getProposalId() {
        return proposalId;
    }

    public void setProposalId(int proposalId) {
        this.proposalId = proposalId;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public LocalDateTime getUploadedAt() {
        return uploadedAt;
    }

    public void setUploadedAt(LocalDateTime uploadedAt) {
        this.uploadedAt = uploadedAt;
    }
}
