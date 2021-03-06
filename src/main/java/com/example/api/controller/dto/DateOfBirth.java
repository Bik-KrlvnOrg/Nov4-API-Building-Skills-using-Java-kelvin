package com.example.api.controller.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class DateOfBirth {
    private LocalDate start;
    private LocalDate end;
}
