package com.example.api.controller;

import com.example.api.service.SdnRepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SdnController {
    private SdnRepoService sdnRepoService;

    public SdnController() {
    }

    @Autowired
    public SdnController(SdnRepoService sdnRepoService) {
        this.sdnRepoService = sdnRepoService;
    }


    @GetMapping("/sdn")
    public ResponseEntity<?> getCached(Pageable pageable) {
        return new ResponseEntity<>(sdnRepoService.getSdns(pageable), HttpStatus.OK);
    }
}
