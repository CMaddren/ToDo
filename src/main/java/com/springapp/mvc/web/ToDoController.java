package com.springapp.mvc.web;

import com.springapp.mvc.model.ToDoList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.HashMap;

@Controller
@RequestMapping("/")
public class ToDoController {

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Welcome to your new ToDo List");
		return "toDo";
	}


//    @RequestMapping(value = {"create"}, method = RequestMethod.GET)
//    public ModelAndView renderCreateForm() {
//        ModelMap model = new ModelMap();
//        model.addAttribute("message", "Create Your List");
//        model.addAttribute("toDoList", new ToDoList());
//      return new ModelAndView("create", "", model);  // the view for this renders a form that will allow users to enter items
//        //later on, add check boxes for the boolean- right now, default to false (done)
//    }

    //TODO- add form and post as a todo list, populating the hash map with items and the booleans (default to not done, false)



    //    @RequestMapping(value = {"/account/create"}, method = RequestMethod.GET)
//    public ModelAndView renderAccountForm(Model model) {
//        model.addAttribute("countries", Countries.values());
//        model.addAttribute("account", new Account());
//        return new ModelAndView("account/create", "validationMessage", model);
//    }

//
//
//    @Autowired
//    public AccountController(AccountService accountService, ReserveOrderService reserveOrderService) {
//        this.accountService = accountService;
//        this.reserveOrderService = reserveOrderService;
//    }
//
//    @RequestMapping(value = {"/account/create"}, method = RequestMethod.GET)
//    public ModelAndView renderAccountForm(Model model) {
//        model.addAttribute("countries", Countries.values());
//        model.addAttribute("account", new Account());
//        return new ModelAndView("account/create", "validationMessage", model);
//    }
//
//    @RequestMapping(value = {"/account/create"}, method = RequestMethod.POST)
//    public ModelAndView createAccount(@ModelAttribute("account") Account account, Model model) throws IOException {
////        try {
////            ServiceResult<Account> result = accountService.createAccount(account);
////
////            if (result.hasErrors()) {
////                return renderViewWithErrorMessages(result.getErrors(), model);
////            }
////            return showSuccess(result.getModel());
////        } catch (Exception e) {
////            return showError();
////        }
//
//        HashMap errors = AccountValidation.verifyCreate(account);
//        ModelMap modelMap = new ModelMap();
//        modelMap.addAttribute("errors", errors);
//        return new ModelAndView("account/create", modelMap);
//    }

}




