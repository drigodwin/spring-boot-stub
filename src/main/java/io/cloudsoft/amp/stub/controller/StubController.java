package io.cloudsoft.amp.stub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StubController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String test(){
        return "Test Run";
    }

    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    @ResponseBody
    public String test2(){
        return "Test Run 2";
    }
}

