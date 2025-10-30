package com.example.thymeleaf_product.controller;

import com.example.thymeleaf_product.entity.Product;
import com.example.thymeleaf_product.service.IProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    final IProductService productService;

    public ProductController(IProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/list")
    public String showList(Model model) {
        List<Product> productList = productService.findAll();
        model.addAttribute("productList", productList);
        return "product/list";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") int id) {
        productService.delete(id);
        return "redirect:/product/list";
    }

    @GetMapping("/detail")
    public String showDetail(@RequestParam("id") int id, Model model) {
        Product product = productService.find(id);
        model.addAttribute("product", product);
        return "product/detail";
    }

    @GetMapping("/update")
    public String update(@RequestParam("id") int id, Model model) {
        Product product = productService.find(id);
        model.addAttribute("product", product);
        return "product/update";
    }

    @PostMapping("/update")
    public String saveUpdate(@ModelAttribute Product product) {
        productService.update(product);
        return "redirect:/product/list";
    }

}
