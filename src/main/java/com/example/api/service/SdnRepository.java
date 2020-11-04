package com.example.api.service;

import com.example.api.model.SdnEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SdnRepository  extends JpaRepository<SdnEntry,String> {
}
