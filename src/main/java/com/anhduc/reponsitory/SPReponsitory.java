package com.anhduc.reponsitory;

import com.anhduc.model.SmartPhone;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SPReponsitory extends CrudRepository<SmartPhone,Integer> {
}
