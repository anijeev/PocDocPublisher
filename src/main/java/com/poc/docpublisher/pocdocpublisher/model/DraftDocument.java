package com.poc.docpublisher.pocdocpublisher.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Document", schema = "draft")
public class DraftDocument extends Document{
	public DraftDocument(){
		
	}
}
