package com.example.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CalculatorController {
    @GetMapping("/home")
    public String showHome() {
        return "home";
    }

    @PostMapping("/calc")
    public String calc(RedirectAttributes redirectAttributes, @RequestParam("operator") String operator, @RequestParam("firstNum") double firstNum, @RequestParam("secondNum") double secondNum) {
        double result = 0;
        String mess = "";
        switch (operator) {
            case "+":
                result = firstNum + secondNum;
                mess = "Result Addition: " + result;
                break;
            case "-":
                result = firstNum - secondNum;
                mess = "Result Substraction: " + result;
                break;
            case "X":
                result = firstNum * secondNum;
                mess = "Result Multiplication: " + result;
                break;
            case "/":
                if (secondNum == 0) {
                    mess = "Result Divide: Not valid";
                } else {
                    result = firstNum / secondNum;
                    mess = "Result Divide: " + result;
                }
                break;
        }
        redirectAttributes.addFlashAttribute("mess", mess);
        redirectAttributes.addFlashAttribute("firstNum", firstNum);
        redirectAttributes.addFlashAttribute("secondNum", secondNum);
        return "redirect:/home";
    }
}
