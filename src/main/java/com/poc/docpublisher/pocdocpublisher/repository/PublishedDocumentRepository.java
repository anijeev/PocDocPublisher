package com.poc.docpublisher.pocdocpublisher.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poc.docpublisher.pocdocpublisher.model.PublishedDocument;

public interface PublishedDocumentRepository  extends JpaRepository<PublishedDocument, Long>{

}
