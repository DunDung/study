package net.skhu.controller;

import net.skhu.dto.Department;
import net.skhu.dto.Professor;
import net.skhu.mapper.DepartmentMapper;
import net.skhu.mapper.ProfessorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("c201432041")
public class ProfessorController {

    @Autowired
    ProfessorMapper professorMapper;
    @Autowired
    DepartmentMapper departmentMapper;

    @GetMapping("list1")
    public String list(Model model) {
        model.addAttribute("professors", professorMapper.findAll());
        return "c201432041/list1";
    }
    @GetMapping("edit")
    public String edit(Model model, @RequestParam("id") int id) {
        Professor professor = professorMapper.findOne(id);
        List<Department> departments = departmentMapper.findAll();
        model.addAttribute("professor", professor);
        model.addAttribute("departments", departments);
        return "c201432041/edit";
    }
    @GetMapping("list2")
    public String list2(Model model, @RequestParam("departmentId") int id) {
        model.addAttribute("professors", professorMapper.findByDepartment(id));
        model.addAttribute("id", id);
        return "c201432041/list2";
    }


}
