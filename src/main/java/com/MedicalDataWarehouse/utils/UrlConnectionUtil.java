package com.MedicalDataWarehouse.utils;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public final class UrlConnectionUtil {

    private static final RestTemplate REST_TEMAPLTE = new RestTemplate();

    private UrlConnectionUtil() {}

    public static String createConnection(String url) {
        ResponseEntity<String> response = REST_TEMAPLTE.getForEntity(url, String.class);
        return response.getBody();
    }
}
