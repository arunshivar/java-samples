package com.arun;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeeController {

    static List<Employee> list=new ArrayList<Employee>();
    static {
        list.add(new Employee(1,"rahul",35000f,"S.Engineer"));
        list.add(new Employee(2,"aditya",25000f,"IT Manager"));
        list.add(new Employee(3,"sachin",55000f,"Care Taker"));
    }
    @RequestMapping("/empform")
    public String showForm(ModelMap modelMap) {
        // return new ModelAndView("empform","command", new Employee());
        modelMap.addAttribute("command", new Employee());
        return "empform";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView saveEmployee(@ModelAttribute("employee") Employee employee) {
        System.out.println(employee.getName()+" "+employee.getSalary());
        list.add(new Employee(list.size(), employee.getName(), employee.getSalary(), employee.getDesignation()));
        return new ModelAndView("redirect:/viewemp");
    }


    @RequestMapping("/viewemp")
    public ModelAndView viewemp(){

        System.out.println(" in view emp");


        /*ModelAndView model = new ModelAndView();
        model.setViewName("viewemp");
        model.addObject("msg", "HELLO");
        return model;*/

        return new ModelAndView("viewemp","list", list);
    }
}
