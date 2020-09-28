package net.skhu.controller;

import net.skhu.dto.Department;
import net.skhu.dto.Student;
import net.skhu.dto.User;
import net.skhu.mapper.DepartmentMapper;
import net.skhu.mapper.StudentMapper;
import net.skhu.mapper.UserMapper;
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
    @Autowired
    UserMapper userMapper;

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

    @GetMapping("departmentList1")
    public String departmentList1(Model model) {
        List<Department> departments = departmentMapper.findAll();
        for(Department department : departments)
            department.setStudents(studentMapper.findByDepartmentId(department.getId()));
        model.addAttribute("departments", departments);
        return "mybatis/departmentList";
    }

    @GetMapping("departmentList2")
    public String departmentList2(Model model) {
        model.addAttribute("departments", departmentMapper.findAllWithStudents());
        return "mybatis/departmentList";
    }

    @GetMapping("dynamicSQL")
    public String dynamicSQL(Model model) {
        List<User> list1 = userMapper.findAllOrderBy(5, "name DESC");
        model.addAttribute("list1", list1);

        User user1 = new User();
        user1.setName("이승진");
        List<User> list2 = userMapper.findByNameOrUserid(user1);
        model.addAttribute("list2", list2);

        User user3 = new User();
        user3.setId(2);
        user3.setName("Lee, Seungjin");
        userMapper.update(user3);

        User user2 = new User();
        user2.setUserid("lsj");
        List<User> list3 = userMapper.findByNameOrUserid2(user2);
        model.addAttribute("list3", list3);

        user3.setName("이승진");
        userMapper.update(user3);

        int[] a = new int[] { 2, 3, 5 };
        List<User> list4 = userMapper.findByIdList(a);
        model.addAttribute("list4", list4);

        return "mybatis/dynamicSQL";
    }
}
