package com.abby.testcssjs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
// @RequestMapping("/admin")
public class TestController {
    @GetMapping("/")
    public String test() {
        return "test1";
    }
}
