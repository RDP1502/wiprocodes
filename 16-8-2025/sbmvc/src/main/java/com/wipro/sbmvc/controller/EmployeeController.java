package com.wipro.sbmvc.controller;

import com.wipro.sbmvc.entity.Employee;
import com.wipro.sbmvc.service.DepartmentService;
import com.wipro.sbmvc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private DepartmentService departmentService;

    // show all employees
    @GetMapping("/list")
    public String listEmployees(Model model) {
        model.addAttribute("employee", employeeService.findAll());
        return "employee-list"; // maps to /WEB-INF/views/employee-list.jsp
    }

    // show form for new employee
    @GetMapping("/new")
    public String showForm(Model model) {
        model.addAttribute("employee", new Employee());
        model.addAttribute("departments", departmentService.findAll());
        return "employee-form";
    }

    // edit existing employee
    @GetMapping("/edit/{id}")
    public String editEmployee(@PathVariable int id, Model model) {
        Employee emp = employeeService.findById(id);
                
        model.addAttribute("employee", emp);
        model.addAttribute("departments", departmentService.findAll());
        return "employee-form";
    }

    // save new or updated employee
    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.save(employee);
        return "redirect:/employee/list";
    }

    // delete employee
    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
        employeeService.delete(id);
        return "redirect:/employee/list";
    }
}
