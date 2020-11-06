package com.example.api.service;

import com.example.api.model.SdnEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SdnRepository  extends JpaRepository<SdnEntry,String>, JpaSpecificationExecutor<SdnEntry> {
}
