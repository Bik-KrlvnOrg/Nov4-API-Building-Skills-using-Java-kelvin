package com.example.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Root(name = "sdnEntry",strict = false)
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class SdnEntry extends EntityWithUUID implements Serializable {
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

    @Element(required = false)
    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    @Basic(fetch = FetchType.LAZY)
    private VesselInfo vesselInfo;

    @ElementList(name = "programList", required = false)
    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    @Basic(fetch = FetchType.LAZY)
    private List<Programs> programsList;

    @ElementList(name = "idList", required = false)
    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    @Basic(fetch = FetchType.LAZY)
    private List<CountryId> countryIdList;

    @ElementList(required = false)
    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    @Basic(fetch = FetchType.LAZY)
    private List<Nationality> nationalityList;

    @ElementList(required = false)
    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    @Basic(fetch = FetchType.LAZY)
    private List<Citizenship> citizenshipList;

    @ElementList(required = false)
    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    @Basic(fetch = FetchType.LAZY)
    private List<Aka> akaList;

    @ElementList(name = "dateOfBirthList", required = false)
    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    @Basic(fetch = FetchType.LAZY)
    private List<Dob> dobList;

    @ElementList(name = "placeOfBirthList", required = false)
    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    @Basic(fetch = FetchType.LAZY)
    private List<PlaceOfBirth> placeOfBirthList;

    @ElementList(required = false)
    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    @Basic(fetch = FetchType.LAZY)
    private List<Address> addressList;
}
