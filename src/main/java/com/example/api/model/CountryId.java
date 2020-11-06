package com.example.api.model;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import javax.persistence.*;
import java.io.Serializable;

@Root(name = "id")
@Data
//@Embeddable
public class CountryId implements Serializable {
    @Element(required = false)
    private String uid;

    @Column(columnDefinition = "text")
    @Element(required = false)
    private String idType;

    @Column(columnDefinition = "text")
    @Element(required = false)
    private String idNumber;

    @Column(columnDefinition = "text")
    @Element(required = false)
    private String idCountry;

    @Column(columnDefinition = "text")
    @Element(required = false)
    private String issueDate;

    @Column(columnDefinition = "text")
    @Element(required = false)
    private String expirationDate;

    @Override
    public String toString() {
        return "CountryId{" +
                "uid='" + uid + '\'' +
                ", idType='" + idType + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", idCountry='" + idCountry + '\'' +
                ", issueDate='" + issueDate + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                '}';
    }
}
