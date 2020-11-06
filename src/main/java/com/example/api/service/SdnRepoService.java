package com.example.api.service;

import com.example.api.model.SdnEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SdnRepoService {
    private SdnRepository sdnRepository;

    public SdnRepoService() {
    }

    @Autowired
    public SdnRepoService(SdnRepository sdnRepository) {
        this.sdnRepository = sdnRepository;
    }

    public void saveData(List<SdnEntry> sdnEntryList) {
        sdnRepository.saveAll(sdnEntryList);
    }

    public Page<SdnEntry> getSdn(Specification<SdnEntry> spec, Pageable pageable) {
        return sdnRepository.findAll(spec, pageable);
    }

    public Page<SdnEntry> getSdn(Pageable pageable) {
        return sdnRepository.findAll(pageable);
    }
}
