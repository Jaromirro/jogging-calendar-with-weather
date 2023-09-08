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
import org.springframework.web.bind.annotation.*;

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

    public int cook;

    public TrainingsController(TrainingsDao trainingsDao,
                               EquipmentDao equipmentDao,
                               UserDao userDao) {
        this.equipmentDao = equipmentDao;
        this.tDao = trainingsDao;
        this.userDao = userDao;
    }
    @GetMapping("/training")
    public String list(Model model, HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("user")) {
                    cook= Integer.parseInt(cookie.getValue());
                }
            }
        }
        List<Trainings> trainings = tDao.findAllUser(userDao.findById(cook));
        model.addAttribute("trainings", trainings);
        return "/training";
    }


    @GetMapping("/tadd")
    public String showForm(Model model) {
        model.addAttribute("training", new Trainings());
        model.addAttribute("equipment", equipmentDao.findAll());
        return "/tadd";
    }

    @PostMapping("/tadd")
    public String processForm(@Valid @ModelAttribute Trainings training, BindingResult result){
        if (result.hasErrors()){
            return "/tadd";
        }
        training.setUser(userDao.findById(cook));
        tDao.saveTraining(training);
        return "redirect:/training";
    }

    @GetMapping("/tupdate/{id}")
    public String updateForm(@PathVariable Integer id, Model model){
        Trainings training = tDao.findById(id);
        model.addAttribute("training", training);
        return "/tupdate";
    }

    @PostMapping("/tupdate/{id}")
    public String updateForm(@Valid Trainings training, BindingResult result){
        if (result.hasErrors()){
            return "/tupdate";
        }
        tDao.update(training);
        return "redirect:/training";
    }

    @GetMapping("/tremove/{id}/confirmed")
    public String remove(@PathVariable Integer id){
        tDao.delete(tDao.findById(id));
        return "redirect:/training";
    }

    @GetMapping("/tremove/{id}")
    public String removeNotConfirmed(@PathVariable Integer id, Model model){
        model.addAttribute("trainingId", id);
        return "/tremove";
    }
    @ModelAttribute("tequipments")
    public List<Equipment> getEquipment() {
        return equipmentDao.findAllUser(userDao.findById(cook));
    }

}
