package com.example.vims_backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ProposalAddon {
	    @Id
	    private int proposalId;
	    @Id
	    private int addonId;
		@Override
		public String toString() {
			return "ProposalAddon [proposalId=" + proposalId + ", addonId=" + addonId + "]";
		}
		public ProposalAddon() {
			super();
			// TODO Auto-generated constructor stub
		}
		public ProposalAddon(int proposalId, int addonId) {
			super();
			this.proposalId = proposalId;
			this.addonId = addonId;
		}
		public int getProposalId() {
			return proposalId;
		}
		public void setProposalId(int proposalId) {
			this.proposalId = proposalId;
		}
		public int getAddonId() {
			return addonId;
		}
		public void setAddonId(int addonId) {
			this.addonId = addonId;
		}
	    
	    
}	
