package kor.ruzun88.java.srt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String helloBoot(){
        return "hello";
    }
}
