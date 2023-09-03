package app.controller;

import app.dao.UserDao;
import app.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class UserController {

    private UserDao userDao;

    public UserController(UserDao bookDao) {
        this.userDao = bookDao;
    }
    @GetMapping("/register")
    public String formAdd(Model model) {

        User user = new User();

        model.addAttribute("user", user);
        return "register";
    }
    @PostMapping("/register")
    @ResponseBody
    public String getAdd(@Valid User user) {

        return user.getName() + ", " + user.getEmail();
    }


}
