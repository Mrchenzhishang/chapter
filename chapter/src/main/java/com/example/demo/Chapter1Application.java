package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
//http://127.0.0.1:8090/test
public class Chapter1Application {
	@RequestMapping("/test")
    @ResponseBody
    public Map<String, String> test() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("key", "value");
        map.put("response", "Chapter1Application");
        map.put("code", "200");
        return map;
    } 
    public static void main(String[] args)throws Exception {
        SpringApplication.run(Chapter1Application.class, args);
    }
}
