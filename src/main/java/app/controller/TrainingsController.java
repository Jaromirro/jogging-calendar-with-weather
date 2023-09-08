package app.controller;

import app.dao.EquipmentDao;
import app.dao.TrainingsDao;
import app.dao.UserDao;
import app.dto.LoginDto;
import app.entity.Equipment;
import app.entity.Trainings;
import app.entity.User;
import app.service.TrainingsService;
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
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Controller
public class TrainingsController {
    private UserDao userDao;
    private TrainingsDao tDao;
    private EquipmentDao equipmentDao;

    public TrainingsController(TrainingsDao trainingsDao,
                               EquipmentDao equipmentDao,
                               UserDao userDao) {
        this.equipmentDao = equipmentDao;
        this.tDao = trainingsDao;
        this.userDao = userDao;
    }
    @GetMapping("/training")
    public String list(Model model){
        List<Trainings> trainings = tDao.findAll();
        model.addAttribute("trainings", trainings);
        return "/training";
    }


    @GetMapping("/tadd")
    public String showForm(Model model) {
        model.addAttribute("training", new Trainings());
        return "/tadd";
    }

    @PostMapping("/tadd")
    public String processForm(@Valid Trainings training, BindingResult bledy){
        if (bledy.hasErrors()){
            return "/tadd";
        }
        training.setUser(userDao.findById(1));
        tDao.saveTraining(training);
        return "redirect:/elist";
    }
    @ModelAttribute("equpimnet")
    public List<Equipment> getEqupment() {
        return equipmentDao.findAll();
    }







}
