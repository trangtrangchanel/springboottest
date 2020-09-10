package com.anhduc.controller;

import com.anhduc.model.SmartPhone;
import com.anhduc.service.SmartPhoneImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    SmartPhoneImpl smartPhoneimpl;



    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<SmartPhone> getAllStudent() {
        List<SmartPhone> listStudent = smartPhoneimpl.getAllSmartPhones();
        return listStudent;
    }

    @PostMapping("/addProduct")
    public SmartPhone addProduct( SmartPhone product) {
        System.out.println("thanh cong");
        return smartPhoneimpl.addSPhone(product);

    }




}
