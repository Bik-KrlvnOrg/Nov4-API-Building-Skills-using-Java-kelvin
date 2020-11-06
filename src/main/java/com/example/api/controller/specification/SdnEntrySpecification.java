package com.example.api.controller.specification;

import com.example.api.controller.dto.SdnEntryRequest;
import com.example.api.model.SdnEntry;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import static org.springframework.data.jpa.domain.Specification.where;

@Component
public class SdnEntrySpecification extends BaseSpecification<SdnEntry, SdnEntryRequest> {

    @Override
    public Specification<SdnEntry> getFilter(SdnEntryRequest request) {
        return (root, query, criteriaBuilder) -> {
            query.distinct(true);
            return where(
                    uidContains(request.getUid())
                            .or(programContains(request.getProgram()))
                            .or(sdnTypeContains(request.getSdnType()))
            ).toPredicate(root, query, criteriaBuilder);
        };

    }

    private Specification<SdnEntry> uidContains(String uid) {
        return useAttributeContains("uid", uid);
    }

    private Specification<SdnEntry> sdnTypeContains(String sdnType) {
        return useAttributeContains("sdnType", sdnType);
    }

    private Specification<SdnEntry> programContains(String program) {
        return useAttributeContains("programsList", program);
    }

}
