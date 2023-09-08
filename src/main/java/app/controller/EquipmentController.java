package app.controller;

import app.dao.EquipmentDao;
import app.entity.Equipment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@Controller
public class EquipmentController {

    private EquipmentDao equipmentDao;

    public EquipmentController(EquipmentDao equipmentDao) {
        this.equipmentDao = equipmentDao;
    }

    @GetMapping("/eadd")
    public String showForm(Model model) {
        model.addAttribute("equipment", new Equipment());
        return "/eadd";
    }

    @PostMapping("/eadd")
    public String processForm(@Valid Equipment equipment, BindingResult bledy){
        if (bledy.hasErrors()){
            return "/eadd";
        }
        equipmentDao.saveEqu(equipment);
        return "redirect:/elist";
    }

    @GetMapping("/elist")
    public String list(Model model){
        List<Equipment> equipments = equipmentDao.findAll();
        model.addAttribute("equipments", equipments);
        return "/elist";
    }


    @GetMapping("/eupdate/{id}")
    public String updateForm(@PathVariable Integer id, Model model){
        Equipment equipment = equipmentDao.findById(id);
        model.addAttribute("equpiments", equipment);
        return "book/update-book-form";
    }

    @PostMapping("/eupdate/{id}")
    public String updateForm(@Valid Equipment equipment, BindingResult result){
        if (result.hasErrors()){
            return "book/update-book-form";
        }
        equipmentDao.update(equipment);
        return "redirect:/elist";
    }

    @ModelAttribute("EquipTyp")
    public List<String> checkOptions() {
        String[] EquipTyp = new String[]{"buty", "kurtka", "koszulka", "spodenki", "spodnie","zegarek"};
        return Arrays.asList(EquipTyp);
    }

}
