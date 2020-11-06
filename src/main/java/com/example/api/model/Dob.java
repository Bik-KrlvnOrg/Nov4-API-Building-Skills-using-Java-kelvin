package com.example.api.model;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import javax.persistence.Id;
import java.io.Serializable;

@Root(name = "dateOfBirthItem")
@Data
public class Dob implements Serializable {
    @Id
    @Element(required = false)
    private String uid;

    @Element(required = false)
    private String dateOfBirth;

    @Element(required = false)
    private String mainEntry;

    @Override
    public String toString() {
        return "Dob{" +
                "uid='" + uid + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", mainEntry='" + mainEntry + '\'' +
                '}';
    }
}
