package com.poc.docpublisher.pocdocpublisher.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poc.docpublisher.pocdocpublisher.model.DraftDocument;

public interface DraftDocumentRepository  extends JpaRepository<DraftDocument, Long>{

}
