package com.projects.todowebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class loginController {

    @Autowired
    private loginAuthentication authentication;

    private Logger logger = LoggerFactory.getLogger(getClass());
    @RequestMapping(value="login",method = RequestMethod.GET)
    public String gotoLoginPage(){
        // logger.debug("Request Param is {}",name);
        // model.put("name", name);
        return "login";
    }

    // We are capturing form data
    // Putting that into the model
    // Using model to show data in the view
    @RequestMapping(value="login",method = RequestMethod.POST)
    public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model){
        // logger.debug("Request Param is {}",name);
        // model.put("name", name);
        model.put("name", name);
        model.put("password", password);
        if(authentication.authenticate(name, password)){
            return "welcome";
        }
        model.put("errorMessage", "Invalid Credentials");
        return "login";
        
    }
}
