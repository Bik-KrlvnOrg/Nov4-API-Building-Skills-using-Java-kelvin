package com.example.api.controller;

import com.example.api.model.Sdn;
import com.example.api.model.SdnEntry;
import com.example.api.service.SdnEntrySpecification;
import com.example.api.service.SdnRepoService;
import com.example.api.service.SdnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class SdnController {
    private SdnRepoService sdnRepoService;
    private SdnService sdnService;

    public SdnController() {
    }

    @Autowired
    public SdnController(SdnRepoService sdnRepoService, SdnService sdnService) {
        this.sdnRepoService = sdnRepoService;
        this.sdnService = sdnService;
    }


    @GetMapping("/sdn")
    public ResponseEntity<?> getCached(Pageable pageable) {
        return new ResponseEntity<>(sdnRepoService.getSdn(pageable), HttpStatus.OK);
    }

    @PostMapping("/sdn")
    public ResponseEntity<?> getCachedFilter(@ModelAttribute("data") SdnEntry query, Pageable pageable) {
        Specification<SdnEntry> spec = new SdnEntrySpecification(query);
        return new ResponseEntity<>(sdnRepoService.getSdn(spec, pageable), HttpStatus.OK);
    }

    @GetMapping("/test")
    public void runTest() throws IOException {
        Sdn data = sdnService.getData();
        System.out.println("\n \n \t data: " + data);
        sdnRepoService.saveData(data.getSdnEntry());
    }
}
