package com.example.api.controller.specification;

import org.springframework.data.jpa.domain.Specification;

public abstract class BaseSpecification<T, U> {

    public abstract Specification<T> getFilter(U request);

    protected String containsLowerCase(String searchField) {
        String wildcard = "%";
        return wildcard + searchField.toLowerCase() + wildcard;
    }

    protected Specification<T> useStringAttributeContains(String attribute, String value) {
        return (root, query, cb) -> {
            if (value == null) {
                return null;
            }
            return cb.like(
                    cb.lower(root.get(attribute)),
                    containsLowerCase(value)
            );
        };
    }

    protected Specification<T> useJsonAttributeContains(String attribute, String key, String value) {
        return (root, query, cb) -> {
            if (value == null) {
                return null;
            }
            return cb.function("jsonb_extract_path_text",
                    String.class, root.<String>get(attribute), cb.literal(key)).in(value);
        };
    }
}
