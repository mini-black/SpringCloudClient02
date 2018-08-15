package com.zhangtao.spring_cloud_client.XiaoheiSpringCloudClient.contrller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringCloudContrllerDemo {
	@RequestMapping(value = "hello",method = RequestMethod.GET)
    public String getMember(){
        return "hello";
    }
}
