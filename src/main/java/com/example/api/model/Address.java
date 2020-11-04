package com.example.api.model;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import javax.persistence.Embeddable;

@Root(name = "Address")
@Data
@Embeddable
public class Address {
    @Element
    private String uid;

    @Element(required = false)
    private String city;

    @Element(required = false)
    private String country;

    @Element(required = false)
    private String address1;

    @Element(required = false)
    private String address2;

    @Element(required = false)
    private String address3;

    @Element(required = false)
    private String postalCode;

    @Element(required = false)
    private String stateOrProvince;

    @Override
    public String toString() {
        return "Address{" +
                "uid='" + uid + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", address3='" + address3 + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}
