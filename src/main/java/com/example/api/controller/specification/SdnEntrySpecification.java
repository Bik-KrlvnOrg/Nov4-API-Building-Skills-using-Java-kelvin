package com.example.api.controller.specification;

import com.example.api.controller.dto.DateOfBirth;
import com.example.api.controller.dto.SdnEntryRequest;
import com.example.api.model.SdnEntry;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import static org.springframework.data.jpa.domain.Specification.where;

@Component
public class SdnEntrySpecification extends BaseSpecification<SdnEntry, SdnEntryRequest> {

    @Override
    public Specification<SdnEntry> getFilter(SdnEntryRequest request) {
        return (root, query, criteriaBuilder) -> where(
                uidContains(request.getUid())
                        .or(programContains(request.getProgram()))
                        .or(sdnTypeContains(request.getSdnType()))
                        .or(dateOfBirthContains(request.getDateOfBirth()))
        ).toPredicate(root, query, criteriaBuilder);
    }


    private Specification<SdnEntry> uidContains(String uid) {
        String attribute = "uid";
        return useStringAttributeContains(attribute, uid);
    }

    private Specification<SdnEntry> dateOfBirthContains(DateOfBirth dateOfBirth) {
        if (dateOfBirth == null) return null;
        String attribute = "dobList";
        String key = "dateOfBirth";
        String date = "";
        if (dateOfBirth.getStart() != null) {
            date = dateOfBirth.toString();
        }
        return useJsonAttributeContains(attribute, key, date);
    }

    private Specification<SdnEntry> sdnTypeContains(String sdnType) {
        String attribute = "sdnType";
        return useStringAttributeContains(attribute, sdnType);
    }

    private Specification<SdnEntry> programContains(String program) {
        String attribute = "programsList";
        return useStringAttributeContains(attribute, program);
    }

}
