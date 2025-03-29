package com.MedicalDataWarehouse.services.impl;

import com.MedicalDataWarehouse.services.MedicalService;
import com.MedicalDataWarehouse.utils.UrlConnectionUtil;
import org.springframework.stereotype.Service;

@Service
public class MedicalServiceImpl implements MedicalService {


    @Override
    public void processMedicalData(String url) {
        String response = UrlConnectionUtil.createConnection(url);
    }
}
