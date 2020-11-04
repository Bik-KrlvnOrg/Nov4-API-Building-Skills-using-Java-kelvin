package com.example.api.model;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import javax.persistence.*;
import java.util.List;

@Root(name = "sdnEntry")
@Data
@Entity
public class SdnEntry {
    @Id
    @GeneratedValue
    @Element(required = false)
    private String uid;

    @Column(columnDefinition = "text")
    @Element(required = false)
    private String title;

    @Column(columnDefinition = "text")
    @Element(required = false)
    private String firstName;

    @Column(columnDefinition = "text")
    @Element(required = false)
    private String lastName;

    @Column(columnDefinition = "text")
    @Element(required = false)
    private String sdnType;

    @Column(columnDefinition = "text")
    @Element(required = false)
    private String remarks;

    @Column(columnDefinition = "text")
    @Element(required = false)
    @Embedded
    private VesselInfo vesselInfo;

    @ElementList(name = "programList", required = false)
    @CollectionTable
    @ElementCollection
    private List<Programs> programsList;

    @ElementList(name = "idList", required = false)
    @CollectionTable
    @ElementCollection
    private List<CountryId> countryIdList;

    @ElementList(required = false)
    @CollectionTable
    @ElementCollection
    private List<Nationality> nationalityList;

    @ElementList(required = false)
    @CollectionTable
    @ElementCollection
    private List<Citizenship> citizenshipList;

    @ElementList(required = false)
    @CollectionTable
    @ElementCollection
    private List<Aka> akaList;

    @ElementList(name = "dateOfBirthList", required = false)
    @CollectionTable
    @ElementCollection
    private List<Dob> dobList;

    @ElementList(name = "placeOfBirthList", required = false)
    @CollectionTable
    @ElementCollection
    private List<PlaceOfBirth> placeOfBirthList;

    @ElementList(required = false)
    @CollectionTable
    @ElementCollection
    private List<Address> addressList;

    @Override
    public String toString() {
        return "SdnEntry{" +
                "uid='" + uid + '\'' +
                ", title='" + title + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sdnType='" + sdnType + '\'' +
                ", remarks='" + remarks + '\'' +
                ", vesselInfo=" + vesselInfo +
                ", programsList=" + programsList +
                ", countryIdList=" + countryIdList +
                ", nationalityList=" + nationalityList +
                ", citizenshipList=" + citizenshipList +
                ", akaList=" + akaList +
                ", dobList=" + dobList +
                ", placeOfBirthList=" + placeOfBirthList +
                ", addressList=" + addressList +
                '}';
    }
}
