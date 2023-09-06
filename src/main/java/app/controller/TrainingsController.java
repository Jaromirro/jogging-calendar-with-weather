package app.controller;

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

@Controller
public class TrainingsController {
    @GetMapping("/calendar")
    public String formAdd(Model model) {

        model.addAttribute("trainingForm", new Trainings());
        return "calendar";
    }
    @PostMapping("/calendar")
    @ResponseBody
    public String getAdd(@ModelAttribute("trainingForm") Trainings trainingForm, BindingResult bindingResult) {

//        TrainingsService.save(trainingForm);

        return "redirect:/welcome";
    }
}
