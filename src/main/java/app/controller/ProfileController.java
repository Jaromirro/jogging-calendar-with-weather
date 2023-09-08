package app.controller;

import app.dao.EquipmentDao;
import app.dao.ProfileDao;
import app.dao.TrainingsDao;
import app.dao.UserDao;
import app.dto.LoginDto;
import app.entity.Equipment;
import app.entity.Profile;
import app.entity.Trainings;
import app.entity.User;
import app.repository.UserRepository;
import app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@Controller
public class ProfileController {
    @Autowired
    private UserService userService;
    private Profile profile;
    private ProfileDao pDao;
    private UserDao userDao;
    private TrainingsDao tDao;
    private EquipmentDao equipmentDao;

    private static String cook = "Weronika";
    @Autowired
    private UserRepository userRepository;

    public ProfileController(UserDao userDao,
                             ProfileDao pDao,
                             UserService userService,
                             TrainingsDao trainingsDao,
                             EquipmentDao equipmentDao) {
        this.userService = userService;
        this.userDao = userDao;
        this.pDao = pDao;
        this.profile = profile;
        this.equipmentDao = equipmentDao;
        this.tDao = trainingsDao;
    }

    @GetMapping("/profile")
    public String read(Model model){
        Profile profile = pDao.findById(1);
        model.addAttribute("profile", profile);




        return "profile";
    }


    @GetMapping("/pedit")
    public String formAdd(Model model) {
        Profile profile = pDao.findById(1);
        model.addAttribute("pForm", profile);
        return "pedit";
    }
    @PostMapping("/pedit")
    public String getAdd(@Valid Profile pForm, BindingResult result) {

        pDao.update(pForm);
        return "profile";
    }
    @ModelAttribute("profile")
    public String getProfil() {
        return String.valueOf(pDao.findById(1));
    }

    @ModelAttribute("trainings")
    public List<Trainings> listTraining(){
        return tDao.findAll();
    }
    @ModelAttribute("equpiment")
    public List<Equipment> listEquipment(){
        return equipmentDao.findAll();
    }
}
