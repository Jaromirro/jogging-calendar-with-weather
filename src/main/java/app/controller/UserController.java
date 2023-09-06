package app.controller;

import app.dao.UserDao;
import app.dto.LoginDto;
import app.entity.User;
import app.repository.UserRepository;
import app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpCookie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    private UserService userService;


    private UserDao userDao;
    private final UserRepository userRepository;

    public UserController(UserDao userDao,
                          UserRepository userRepository) {
        this.userDao = userDao;
        this.userRepository = userRepository;
    }
    @GetMapping("/register")
    public String formAdd(Model model) {

        model.addAttribute("userForm", new User());
        return "register";
    }
    @PostMapping("/register")
    @ResponseBody
    public String getAdd(@ModelAttribute("userForm") User userForm, BindingResult bindingResult) {
        userService.save(userForm);

        return "sign";
    }

    @GetMapping("/login")
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");

        return "login";
    }
    @PostMapping("/login")
    public String login(HttpServletResponse response, LoginDto loginDto) {
        User user = userService.findByName(loginDto.getName());
        if (user == null) {
            return "error";
        }
        if (!user.getPasswordConfirm().equals(loginDto.getPassword())) {
            return "error";
        }
        response.addCookie(new Cookie("user", loginDto.getName()));

        return "/welcome";
    }

    @GetMapping({ "/welcome"})
    public String welcome(Model model) {
        return "welcome";
    }



}
