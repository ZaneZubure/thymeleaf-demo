package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class UserController {

    @GetMapping("/users")

    //attach things to the model to be used in a template
    String getUser(Model model){
        model.addAttribute("message", "from controller");
        model.addAttribute("users", Arrays.asList(
                new User ("Harry", 20, "jogging"),
                new User ("Linda", 25, "skiing"),
                new User ("Tom", 21, "gaming")
                ));
        //return the name of the template
        return "users";
    }
}
