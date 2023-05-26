package com.poc.docpublisher.pocdocpublisher.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Document", schema = "Published")  
public class PublishedDocument extends Document{
	public  PublishedDocument(){
		
	}
	

}
