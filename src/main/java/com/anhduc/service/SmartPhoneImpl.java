package com.anhduc.service;

import com.anhduc.model.SmartPhone;
import com.anhduc.reponsitory.SPReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SmartPhoneImpl implements SmartPhoneSerivice {
    @Autowired
    SPReponsitory spReponsitory;

    @Override
    public List<SmartPhone> getAllSmartPhones() {
        return (List<SmartPhone>) spReponsitory.findAll();
    }

    @Override
    public SmartPhone addSPhone(SmartPhone newPhone) {
        return spReponsitory.save(newPhone);
    }

    @Override
    public SmartPhone updateSP(SmartPhone updateSP) {
        SmartPhone existingProduct = spReponsitory.findById(updateSP.getId()).orElse(null);
        existingProduct.setId(updateSP.getId());
        existingProduct.setNamePhone(updateSP.getNamePhone());
        existingProduct.setPrice(updateSP.getPrice());
        existingProduct.setCompany(updateSP.getCompany());
        return spReponsitory.save(existingProduct);
    }

    @Override
    public String deleteSP(int id) {
        spReponsitory.deleteById(id);
        return "product removed !! " + id;
    }

    @Override
    public SmartPhone getSPById(int id) {
        return spReponsitory.findById(id).orElse(null);
    }


}
