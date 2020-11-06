package com.example.api.service;

import com.example.api.controller.dto.SdnEntryRequest;
import com.example.api.controller.specification.SdnEntrySpecification;
import com.example.api.model.SdnEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SdnEntryService {
    private SdnRepository sdnRepository;
    private SdnEntrySpecification sdnEntrySpecification;

    public SdnEntryService() {
    }

    @Autowired
    public SdnEntryService(SdnRepository sdnRepository, SdnEntrySpecification sdnEntrySpecification) {
        this.sdnRepository = sdnRepository;
        this.sdnEntrySpecification = sdnEntrySpecification;
    }

    public void saveData(List<SdnEntry> sdnEntryList) {
        sdnRepository.saveAll(sdnEntryList);
    }

    public Page<SdnEntry> getSdn(SdnEntryRequest request, Pageable pageable) {
        return sdnRepository.findAll(sdnEntrySpecification.getFilter(request), pageable);
    }
}
