package com.example.api.controller.dto;

import lombok.Data;

@Data
public class SdnEntryRequest {
    private String program;
    private String uid;
    private String sdnType;
    private DateOfBirth dateOfBirth;
}

