package com.anhduc.service;

import com.anhduc.model.SmartPhone;

import java.util.List;

public interface SmartPhoneSerivice {
  List<SmartPhone> getAllSmartPhones();
  SmartPhone addSPhone(SmartPhone newPhone);
  SmartPhone updateSP(SmartPhone updateSP);
  String deleteSP(int id);
  SmartPhone getSPById(int id);
}
