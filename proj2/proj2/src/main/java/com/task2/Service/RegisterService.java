package com.task2.Service;

import com.task2.Entity.Kitinfo;
import com.task2.Entity.Register;
import com.task2.Repo.KitinfoRepo;
import com.task2.Repo.RegisterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {
    @Autowired
    RegisterRepo registerRepo;


    public void addDetail(Register register){
        registerRepo.save(register);
    }


}
