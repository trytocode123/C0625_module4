package com.example.vocabulary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class Vocabulary {
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String showHome() {
        return "home";
    }

    @RequestMapping(value = "/home", method = RequestMethod.POST)
    public String result(Model model, @RequestParam("voc") String voc) {
        final Map<String, String> vocabulary = new HashMap<>();
        vocabulary.put("hello", "Xin chào");
        vocabulary.put("what", "Cái gì");
        vocabulary.put("where", "Ở đâu");
        vocabulary.put("how", "Như thế nào");
        String vocLow = voc.toLowerCase();
        for (int i = 0; i < vocabulary.size(); i++) {
            if (vocabulary.containsKey(vocLow)) {
                model.addAttribute("voc", vocabulary.get(vocLow));
                model.addAttribute("input", voc);
                break;
            } else {
                model.addAttribute("voc", "Not found result");
            }
        }
        return "home";
    }
}
