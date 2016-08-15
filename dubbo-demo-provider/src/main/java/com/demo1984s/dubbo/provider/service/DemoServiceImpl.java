package com.demo1984s.dubbo.provider.service;

import com.demo1984s.dubbo.api.service.DemoService;

/**
 * Created by tangjun on 16/8/15.
 */
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "\n##############################\nDubbo say hello " + name + " to you! \n" +
                "##############################\n";
    }

}
