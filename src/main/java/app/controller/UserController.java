package app.controller;

import app.dao.ProfileDao;
import app.dao.UserDao;
import app.dto.LoginDto;
import app.entity.Profile;
import app.entity.User;
import app.repository.UserRepository;
import app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpCookie;
import org.springframework.security.core.parameters.P;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;


    private UserDao userDao;

    private Profile profile;

    private ProfileDao pDao;
    private final UserRepository userRepository;

    public UserController(UserDao userDao,
                          UserRepository userRepository,
                          ProfileDao profileDao) {
        this.userDao = userDao;
        this.userRepository = userRepository;
        this.pDao = profileDao;
    }
    @GetMapping("/register")
    public String formAdd(Model model) {
        User user = new User();
        model.addAttribute("userForm", user);

        return "register";
    }
    @PostMapping("/register")
    @ResponseBody
    public String getAdd(@ModelAttribute("userForm") User userForm, BindingResult bindingResult) {

        userService.save(userForm);
        Profile profile = new Profile();
        profile.setUser(userForm);
        profile.setFirstName(null);
        pDao.saveProfile(profile);

        return "sign.jsp";
    }

    @GetMapping("/login")
    public String login(Model model) {

        return "login";
    }
    @PostMapping("/login")
    public String login(HttpServletResponse response, LoginDto loginDto) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        User user = userService.findByName(loginDto.getName());
        if (user == null) {
            return "error";
        }
//        if (!user.getPasswordConfirm().equals(loginDto.getPassword()))
            if (!encoder.matches(loginDto.getPassword(), user.getPassword()))
        {
            return "error";
        }

        response.addCookie(new Cookie("user", loginDto.getName()));

        return "/welcome";
    }




    @GetMapping({ "/welcome"})
    public String welcome(LoginDto loginDto) {

        String user = loginDto.getName();
        return "welcome";
    }

    @GetMapping({ "/logout"})
    public String welcome(HttpServletResponse response, LoginDto loginDto) {
        Cookie cookie = new Cookie("user", null);
        cookie.setMaxAge(0);
        cookie.setSecure(true);
        cookie.setHttpOnly(true);
        cookie.setPath("/");

//add cookie to response
        response.addCookie(cookie);

        return "index";
    }





}
