package app.controller;

import app.dao.EquipmentDao;
import app.dao.UserDao;
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

    private UserDao userDao;

    public EquipmentController(EquipmentDao equipmentDao, UserDao userDao) {

        this.equipmentDao = equipmentDao;
        this.userDao = userDao;
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
        equipment.setUser(userDao.findById(1));
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
        model.addAttribute("equipments", equipment);
        return "/eupdate";
    }

    @PostMapping("/eupdate/{id}")
    public String updateForm(@Valid Equipment equipment, BindingResult result){
        if (result.hasErrors()){
            return "/eupdate";
        }
        equipmentDao.update(equipment);
        return "redirect:/elist";
    }

    @GetMapping("/eremove/{id}/confirmed")
    public String remove(@PathVariable Integer id){
        equipmentDao.delete(equipmentDao.findById(id));
        return "redirect:/elist";
    }

    @GetMapping("/eremove/{id}")
    public String removeNotConfirmed(@PathVariable Integer id, Model model){
        model.addAttribute("equipmentId", id);
        return "/eremove";
    }

    @ModelAttribute("EquipTyp")
    public List<String> checkOptions() {
        String[] EquipTyp = new String[]{"buty", "kurtka", "koszulka", "spodenki", "spodnie","zegarek"};
        return Arrays.asList(EquipTyp);
    }

}
