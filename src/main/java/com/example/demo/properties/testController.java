package com.example.demo.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testController {

    @Value("${wdf.name}")
    private String wdf;

    @RequestMapping("/wdf")
    @ResponseBody
    public String test(){
        System.out.println(wdf);
        return wdf;
    }
}
