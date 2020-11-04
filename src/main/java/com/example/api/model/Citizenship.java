package com.example.api.model;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import javax.persistence.Embeddable;

@Root(name = "citizenship")
@Data
@Embeddable
public class Citizenship {
    @Element(required = false)
    private String uid;

    @Element(required = false)
    private String country;

    @Element(required = false)
    private String mainEntry;
}
