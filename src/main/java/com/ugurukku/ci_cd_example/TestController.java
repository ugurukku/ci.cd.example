package com.ugurukku.ci_cd_example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String salam() {
        return "SALAM V1";
    }

}
