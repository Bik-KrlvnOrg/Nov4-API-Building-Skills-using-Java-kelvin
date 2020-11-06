package com.example.api.model;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import javax.persistence.*;
import java.io.Serializable;

@Root(name = "vesselInfo")
@Data
//@Embeddable
public class VesselInfo  implements Serializable {
    @Column(columnDefinition = "text")
    @Element(required = false)

    private String callSign;
    @Column(columnDefinition = "text")
    @Element(required = false)
    private String vesselType;

    @Column(columnDefinition = "text")
    @Element(required = false)
    private String vesselFlag;

    @Column(columnDefinition = "text")
    @Element(required = false)
    private String vesselOwner;

    @Column(columnDefinition = "text")
    @Element(required = false)
    private String tonnage;

    @Column(columnDefinition = "text")
    @Element(required = false)
    private String grossRegisteredTonnage;

    @Override
    public String toString() {
        return "VesselInfo{" +
                "callSign='" + callSign + '\'' +
                ", vesselType='" + vesselType + '\'' +
                ", vesselFlag='" + vesselFlag + '\'' +
                ", vesselOwner='" + vesselOwner + '\'' +
                ", tonnage='" + tonnage + '\'' +
                ", grossRegisteredTonnage='" + grossRegisteredTonnage + '\'' +
                '}';
    }
}
