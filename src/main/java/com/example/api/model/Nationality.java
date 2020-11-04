package com.example.api.model;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import javax.persistence.*;

@Root(name = "nationality")
@Data
@Embeddable
public class Nationality {
    @Element(required = false)
    private String uid;

    @Column(columnDefinition = "text")
    @Element(required = false)
    private String country;

    @Column(columnDefinition = "text")
    @Element(required = false)
    private String mainEntry;

    @Override
    public String toString() {
        return "Nationality{" +
                "uid='" + uid + '\'' +
                ", country='" + country + '\'' +
                ", mainEntry='" + mainEntry + '\'' +
                '}';
    }
}
