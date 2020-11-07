package com.example.api.controller;

import com.example.api.controller.dto.SdnEntryRequest;
import com.example.api.model.Sdn;
import com.example.api.model.SdnEntry;
import com.example.api.controller.specification.SdnEntrySpecification;
import com.example.api.service.SdnEntryService;
import com.example.api.service.SdnApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class SdnController {
    private SdnEntryService sdnEntryService;
    private SdnApiService sdnApiService;

    public SdnController() {
    }

    @Autowired
    public SdnController(SdnEntryService sdnEntryService, SdnApiService sdnApiService) {
        this.sdnEntryService = sdnEntryService;
        this.sdnApiService = sdnApiService;
    }

    @GetMapping("/sdn")
    public ResponseEntity<?> getCachedFilter(SdnEntryRequest request, Pageable pageable) {
        return new ResponseEntity<>(sdnEntryService.getSdn(request, pageable), HttpStatus.OK);
    }

    @GetMapping("/test")
    public void runTest() throws IOException {
        Sdn data = sdnApiService.getData();
        System.out.println("\n \n \t data: " + data);
        sdnEntryService.saveData(data.getSdnEntry());
    }
}
