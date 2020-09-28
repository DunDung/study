package net.skhu.controller;

import net.skhu.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home")
public class HomeController {

    @Autowired
    DepartmentMapper departmentMapper;

    @GetMapping("test1")
    public String list(Model model) {
        model.addAttribute("departments", departmentMapper.findAll());
        return "home/test1";
    }

    @GetMapping("test2")
    public String list2(Model model) {
        model.addAttribute("number", 123);
        return "home/test2";
    }
}
