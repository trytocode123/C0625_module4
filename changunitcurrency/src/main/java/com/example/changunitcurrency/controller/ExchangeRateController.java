package com.example.changunitcurrency.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ExchangeRateController {
    @RequestMapping(value = "/home", method = RequestMethod.GET )
    public String showHome() {
        return "home";
    }

    @RequestMapping(value = "/home", method = RequestMethod.POST )
    public String showHome(Model model, @RequestParam(value = "amountUSD", required = false) Long amountUSD) {
        model.addAttribute("amountUSD", amountUSD);
        return "home";
    }

    @RequestMapping(value = "/exchange", method = RequestMethod.POST)
    public String showResult(Model model, @RequestParam(value = "amountUSD", required = false) Long amountUSD) {
        long money;
        if (amountUSD == null) {
            return "home";
        } else {
            money = 26000 * amountUSD;
            model.addAttribute("money", money);
            model.addAttribute("amountUSD", amountUSD);
            return "result";
        }
    }
}
