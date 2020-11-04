package com.example.api.model;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name = "sdnList", strict = false)
@Data
public class Sdn {

    @Element(name = "publshInformation")
    private PublishInformation publishInformation;

    @ElementList(name = "sdnEntry", inline = true)
    private List<SdnEntry> sdnEntry;

    @Override
    public String toString() {
        return "Sdn{" +
                "publishInformation=" + publishInformation +
                ", sdnEntry=" + sdnEntry +
                '}';
    }
}
