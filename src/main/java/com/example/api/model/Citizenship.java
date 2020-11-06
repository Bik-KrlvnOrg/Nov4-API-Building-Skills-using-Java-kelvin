package com.example.api.model;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.io.Serializable;

@Root(name = "citizenship")
@Data
public class Citizenship implements Serializable {
    @Element(required = false)
    private String uid;

    @Element(required = false)
    private String country;

    @Element(required = false)
    private String mainEntry;
}
