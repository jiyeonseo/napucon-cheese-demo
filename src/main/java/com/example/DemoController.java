package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by jiyeon on 2016. 11. 7..
 */
@Controller
public class DemoController {

    @RequestMapping("/demo")
    public String greeting(Model model) {
        return "demo";
    }

}
