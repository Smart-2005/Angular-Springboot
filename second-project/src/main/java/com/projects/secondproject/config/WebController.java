package com.projects.secondproject.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping(value = "/**/{path:[^\\.]*}")
    public String redirect() {
        // Forward to `index.html`.
        return "forward:/index.html";
    }
}
