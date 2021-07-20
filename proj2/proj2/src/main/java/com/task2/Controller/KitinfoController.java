package com.task2.Controller;

import com.task2.Entity.Kitinfo;
import com.task2.Repo.KitinfoRepo;
import com.task2.Service.KitinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KitinfoController {

    @Autowired
    KitinfoRepo kitinfoRepo;
    @Autowired
    KitinfoService kitinfoService;

    @RequestMapping(method = RequestMethod.POST, value = "/kit")
    public String addKit(@RequestBody Kitinfo kitinfo){
        kitinfoService.addKit(kitinfo);
        return "Added Successfully";
    }


}
