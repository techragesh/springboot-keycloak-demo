package com.ebpi.springbootkeycloakdemo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Controller
public class PersonController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/persons")
    public String getPersons(Model model) {
        model.addAttribute("persons", Arrays.asList("John","Kevin","Micha"));
        return "persons";
    }


    @GetMapping("/products")
    public String getProducts(Model model) {
        model.addAttribute("products", Arrays.asList("iphone","Samsung","LG"));
        return "products";
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request) throws ServletException {
        request.logout();
        return "/";
    }
}
