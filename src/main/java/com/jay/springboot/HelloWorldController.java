package com.jay.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    @GetMapping("/hello")
    public String Hello(Model model) {
        model.addAttribute("message", "Hello World");
        return "HelloWorld";
    }

    @GetMapping("/style")
    public String style() {

        return "add-css-js-demo";
    }

    @GetMapping("/bootstrap")
    public String bootstrap() {

        return "add-bootstrap";
    }
}
