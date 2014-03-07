package com.springapp.mvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/toDo/create")


public class CreateController {

    @RequestMapping(method = RequestMethod.GET)
    public String showCreateView(ModelMap modelMap) {
        return "/create";
    }
}
