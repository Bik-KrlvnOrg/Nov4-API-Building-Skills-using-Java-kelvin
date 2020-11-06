package com.example.api.model;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import javax.persistence.*;
import java.io.Serializable;

@Root(name = "program")
@Data
//@Embeddable
public class Programs implements Serializable {
    @Column(columnDefinition = "text")
    @Element(required = false)
    private String program;

    @Override
    public String toString() {
        return "Program{" +
                "program='" + program + '\'' +
                '}';
    }
}
