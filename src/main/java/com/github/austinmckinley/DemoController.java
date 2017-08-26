package com.github.austinmckinley;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    public DemoController() {
    }

    @RequestMapping(value = "/")
    public String getDemo() {
        return "Demo! :)";
    }
}
