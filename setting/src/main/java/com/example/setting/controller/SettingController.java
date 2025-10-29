package com.example.setting.controller;

import com.example.setting.entity.Setting;
import com.example.setting.service.SettingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@Controller
@RequestMapping(value = "/home")

public class SettingController {
    private final SettingService settingService;

    public SettingController(SettingService settingService) {
        this.settingService = settingService;
    }

    @GetMapping(value = "/form")
    public String showForm(Model model, @ModelAttribute Setting setting) {
        model.addAttribute("lans", List.of(" English", "Vietnamese", "Japanese", "Chinese"));
        model.addAttribute("sizes", List.of(5, 10, 15, 25, 50, 100));
        model.addAttribute("setting", new Setting());
        return "home";
    }

    @PostMapping(value = "/update")
    public String update(@ModelAttribute Setting setting, Model model) {
        Setting settingUpdate = settingService.update(setting);
        model.addAttribute("setting", settingUpdate);
        return "result";
    }

    @GetMapping(value = "/result")
    public String result() {
        return "result";
    }
}
