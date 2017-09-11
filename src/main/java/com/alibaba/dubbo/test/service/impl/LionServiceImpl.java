package com.alibaba.dubbo.test.service.impl;

import com.alibaba.dubbo.test.service.CatService;
import com.alibaba.dubbo.test.service.DogService;
import com.alibaba.dubbo.test.service.LionService;
import com.alibaba.dubbo.test.service.MouseService;

import org.springframework.stereotype.Service;

/**
 * Created by ken.lj on 2017/9/8.
 */
@Service("lionService")
public class LionServiceImpl implements LionService {
    private CatService catService;

    private MouseService mouseService;

    private DogService dogService;

    @Override
    public void eat(String master) {
        System.out.println(master + " eat me.");
        dogService.eat("dog");
        catService.eat("cat");
        mouseService.eat("mouse");
    }

    @Override
    public String getName() {
        return "Simba Lion";
    }
}