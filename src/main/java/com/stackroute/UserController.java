package com.stackroute;


import com.stackroute.users.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("")
@Controller
public class UserController {

    @RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap model){

        User user = new User("M Shaikh");
        model.addAttribute("message",user.getUserName());
        return "index";
    }

}
