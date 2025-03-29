package com.MedicalDataWarehouse.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

public final class UrlMappingUtil {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    private UrlMappingUtil() {}

    public static <T> T mapToObject(String urlResponse, Class<T> clazz) {
        try {
            return OBJECT_MAPPER.readValue(urlResponse, clazz);
        } catch (Exception e) {
            throw new RuntimeException("Failed to map URL response to object", e);
        }
    }
}

