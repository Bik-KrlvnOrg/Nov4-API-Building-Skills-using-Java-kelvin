package com.example.api.service;

import com.example.api.model.SdnEntry;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class SdnEntrySpecification implements Specification<SdnEntry> {
    private final SdnEntry criteria;
    private final List<Predicate> predicates = new ArrayList<>();

    public SdnEntrySpecification(SdnEntry criteria) {
        this.criteria = criteria;
    }

    @Override
    public Predicate toPredicate(@NotNull Root<SdnEntry> root, @NotNull CriteriaQuery<?> query, @NotNull CriteriaBuilder criteriaBuilder) {
        if (criteria.getUid() != null) {
            predicates.add(criteriaBuilder.equal(root.get("uid"), criteria.getUid()));
        }
        if (criteria.getProgramsList() != null) {
            predicates.add(criteriaBuilder.equal(root.get("program"), criteria.getProgramsList()));
        }
        if (criteria.getSdnType() != null) {
            predicates.add(criteriaBuilder.equal(root.get("sdnType"), criteria.getSdnType()));
        }
        if (criteria.getDobList() != null) {
            predicates.add(criteriaBuilder.equal(root.get("dateOfBirth"), criteria.getDobList()));
            predicates.add(criteriaBuilder.greaterThan(root.get("dateOfBirth.start"), criteria.getDobList().get(0).getDateOfBirth()));
            predicates.add(criteriaBuilder.lessThan(root.get("dateOfBirth.end"), criteria.getDobList().get(0).getDateOfBirth()));
        }
        return query.where(criteriaBuilder.and(predicates.toArray(new Predicate[0]))).distinct(true).getRestriction();
//                .distinct(true).orderBy(criteriaBuilder.asc(root.get("id"))).getRestriction();
    }
}
