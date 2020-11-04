package com.example.api.service;

import com.example.api.model.SdnEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
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

    @Transactional(readOnly = true)
    public void saveData(List<SdnEntry> sdnEntryList) {
        sdnRepository.saveAll(sdnEntryList);
    }

    public Page<SdnEntry> getSdns(Pageable pageable) {
        return sdnRepository.findAll(pageable);
    }
}
