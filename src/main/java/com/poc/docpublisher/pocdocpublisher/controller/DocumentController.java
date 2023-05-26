package com.poc.docpublisher.pocdocpublisher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.docpublisher.pocdocpublisher.model.Document;
import com.poc.docpublisher.pocdocpublisher.model.DraftDocument;
import com.poc.docpublisher.pocdocpublisher.model.PublishedDocument;
import com.poc.docpublisher.pocdocpublisher.repository.DraftDocumentRepository;
import com.poc.docpublisher.pocdocpublisher.repository.PublishedDocumentRepository;

@RestController
public class DocumentController {
	
	@Autowired
	DraftDocumentRepository draftsRepo;
	@Autowired
	PublishedDocumentRepository publishedRepo;
	@PostMapping("/document") 
	public ResponseEntity insertDocument() {
		PublishedDocument doc = new PublishedDocument();
		doc.setName("Published Doc");
		doc.setAuthor("Good author");
		doc.setName("Published Doc");
		publishedRepo.save(doc);
		Document draftDoc = new DraftDocument();
		draftDoc.setAuthor("New Author");
		draftDoc.setName("Draft Doc" );
		draftsRepo.save((DraftDocument)draftDoc);
		
		return new ResponseEntity<>(HttpStatus.OK);		
	}
	
	

}
