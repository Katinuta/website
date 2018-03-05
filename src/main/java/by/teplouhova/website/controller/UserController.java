package by.teplouhova.website.controller;

import by.teplouhova.website.model.Form;
import by.teplouhova.website.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private FormService formService;

    @RequestMapping("/addForm")
    public String addForm(Model model) {
        model.addAttribute("form", new Form());
        return "newForm";
    }

    @PostMapping("/save")
    public String saveForm(@ModelAttribute Form form) {
        formService.saveForm(form);
        return "redirect:/";
    }

    @RequestMapping("/get-forms")
    public @ResponseBody
    List<Form> getForms() {
        return formService.findAll();
    }

    @RequestMapping("/forms/{formId}")
    public String getForm(@PathVariable("formId") Long formId, Model model) {
        model.addAttribute("form", formService.findForm(formId));
        return "form";
    }
}

