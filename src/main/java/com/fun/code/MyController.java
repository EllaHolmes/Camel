package com.fun.code;

import com.fun.code.services.MathService;
import org.apache.camel.CamelContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class MyController {

    private MathService mathService;

    @Autowired
    public MyController(MathService mathService) {
        this.mathService = mathService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public void getMethod(){
        mathService.add();
    }
}
