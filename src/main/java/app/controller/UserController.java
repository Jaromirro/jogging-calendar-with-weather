package app.controller;

import app.dao.UserDao;
import app.entity.User;
import app.service.UserService;
import app.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserValidator userValidator;

    private UserDao userDao;

    public UserController(UserDao bookDao) {
        this.userDao = bookDao;
    }
    @GetMapping("/register")
    public String formAdd(Model model) {

        model.addAttribute("userForm", new User());
        return "register";
    }
    @PostMapping("/register")
    @ResponseBody
    public String getAdd(@ModelAttribute("userForm") User userForm, BindingResult bindingResult) {
        userValidator.validate(userForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "register";
        }

        userService.save(userForm);

        return "redirect:/welcome";
    }

    @GetMapping("/login")
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");

        return "login";
    }

    @GetMapping({ "/welcome"})
    public String welcome(Model model) {
        return "welcome";
    }


}
