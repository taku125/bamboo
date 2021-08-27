package my.project.bamboo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import my.project.bamboo.entity.Account;
import my.project.bamboo.service.AccountService;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {


    @Autowired
    AccountService accountService;

    @GetMapping("/account")
    public String index(Model model) {
        Account data;
        data = accountService.findOne((long)1);
        List<Account> accounts = accountService.findAll();
        
        model.addAttribute("id", data.getId());
        model.addAttribute("address", data.getAddress());
        model.addAttribute("age", data.getAge());
        model.addAttribute("name", data.getName());
        return "index.html";
    }
    
   
}
