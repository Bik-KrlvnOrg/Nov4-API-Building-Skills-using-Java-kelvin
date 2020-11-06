package com.example.api.model;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import javax.persistence.*;


@Root(name = "publshInformation")
@Data
//@Embeddable
public class PublishInformation {

    @Element(name = "Publish_Date", required = false)
    private String publishDate;

    @Element(name = "Record_Count", required = false)
    private String recordCount;

    @Override
    public String toString() {
        return "PublishInformation{" +
                "publishDate='" + publishDate + '\'' +
                ", recordCount='" + recordCount + '\'' +
                '}';
    }
}
