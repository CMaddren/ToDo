package com.springapp.mvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/create")


public class CreateController {

    @RequestMapping(method = RequestMethod.GET)
    public String showCreateView(ModelMap modelMap) {
        return "create";
    }
}
