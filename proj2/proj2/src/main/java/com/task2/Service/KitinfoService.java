package com.task2.Service;

import com.task2.Entity.Kitinfo;
import com.task2.Repo.KitinfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KitinfoService {
    @Autowired
    KitinfoRepo kitinfoRepo;

    public void addKit(Kitinfo kitinfo){
        kitinfoRepo.save(kitinfo);
    }
}
