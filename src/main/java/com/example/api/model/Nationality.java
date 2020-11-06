package com.example.api.model;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import javax.persistence.*;
import java.io.Serializable;

@Root(name = "nationality")
@Data
public class Nationality implements Serializable {
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
