package com.task2.Controller;

import com.task2.Entity.Kitinfo;
import com.task2.Entity.Register;
import com.task2.Repo.KitinfoRepo;
import com.task2.Repo.RegisterRepo;
import com.task2.Service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RegisterController {

    @Autowired
    RegisterRepo registerRepo;

    @Autowired
    RegisterService RegisterService;


    @RequestMapping(method = RequestMethod.POST, value = "/detail")
    public String addDetail(@RequestBody Register register){
        RegisterService.addDetail(register);
        return "Added Successfully";
    }



}
