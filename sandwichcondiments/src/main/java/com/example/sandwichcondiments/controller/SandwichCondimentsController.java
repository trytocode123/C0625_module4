package com.example.sandwichcondiments.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SandwichCondimentsController {

    @GetMapping("/home")
    public String showHome(Model model) {
        String[] condimentsList = new String[]{"Lettuce", "Tomato", "Mustard", "Sprouts"};
        model.addAttribute("condimentsList", condimentsList);
        return "home";
    }

    @PostMapping("/save")
    public String save(@RequestParam("condiment") String[] condiments, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("condiments", condiments);
        return "redirect:/home";
    }
}
