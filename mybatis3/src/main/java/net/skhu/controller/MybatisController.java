package net.skhu.controller;

import net.skhu.dto.Department;
import net.skhu.mapper.DepartmentMapper;
import net.skhu.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("mybatis")
public class MybatisController {

    @Autowired
    DepartmentMapper departmentMapper;
    @Autowired
    StudentMapper studentMapper;

    @GetMapping("cacheTest")
    public String cacheTest(Model model) {
        List<Department> departments = departmentMapper.findAll();
        model.addAttribute("departments", departments);
        model.addAttribute("department", departments.get(0));
        model.addAttribute("students", studentMapper.findAll().subList(0, 5));
        return "mybatis/cacheTest";
    }

    @PostMapping("cacheTest")
    public String cache(Model model, Department department) {
        departmentMapper.update(department);
        return "redirect:cacheTest";
    }
}
