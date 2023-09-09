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
import app.repository.TrainingsRepository;
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
    private TrainingsRepository trainingsRepository;
    private ProfileDao pDao;
    private UserDao userDao;
    private TrainingsDao tDao;
    private EquipmentDao equipmentDao;

    public int cook;

    @Autowired
    private UserRepository userRepository;

    public ProfileController(UserDao userDao,
                             ProfileDao pDao,
                             UserService userService,
                             TrainingsDao trainingsDao,
                             EquipmentDao equipmentDao,
                             TrainingsRepository trainingsRepository) {
        this.userService = userService;
        this.userDao = userDao;
        this.pDao = pDao;
        this.equipmentDao = equipmentDao;
        this.tDao = trainingsDao;
        this.trainingsRepository = trainingsRepository;
    }

    @GetMapping("/profile")
    public String read(Model model, HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("user")) {
                    cook= Integer.parseInt(cookie.getValue());
                }
            }
        }
        Profile profile = pDao.findById(cook);
        model.addAttribute("profile", profile);
        List<Trainings> trainings = tDao.findAllUser(userDao.findById(cook));
        model.addAttribute("trainings", trainings);
        List<Equipment> equipments = equipmentDao.findAllUser(userDao.findById(cook));
        model.addAttribute("equipments", equipments);
        int lol2 = cook;
        model.addAttribute("sum", sum());
        System.out.println(sum());


        return "profile";
    }

    @GetMapping("/calednar")
    public String calendar(Model model){
        return "redirect:/calendar";
    }


    @GetMapping("/pedit")
    public String formAdd(Model model) {
        Profile profile = pDao.findById(cook);
        model.addAttribute("pForm", profile);
        return "pedit";
    }
    @PostMapping("/pedit")
    public String getAdd(Profile pForm) {

        pDao.update(pForm);
        return "profile";
    }
    @ModelAttribute("profile")
    public String getProfil() {
        return String.valueOf(pDao.findById(cook));
    }

    @ModelAttribute("trainings")
    public List<Trainings> listTraining(){
        return tDao.findAllUser(userDao.findById(cook));
    }
    @ModelAttribute("equpiment")
    public List<Equipment> listEquipment(){
        return equipmentDao.findAllUser(userDao.findById(cook));
    }
    @ModelAttribute("sum")
    public int sum(){
        return trainingsRepository.sumDistance(userDao.findById(1));
    }
}
