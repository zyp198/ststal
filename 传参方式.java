package com.ler.formparm;
import entry.student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class formcontroller {
    @RequestMapping("student.do")
    public String form()
    {
        return "form/student";
    }
    @RequestMapping("addStudent.do")
    /*SpringMVC 接收参数的三种形式
    * 1----HttpServletRequest request
    * request.getParameter("form-param");
    * 2----form1(String name1, int age, int id)
    * 3----自定义实体类接收，使用注解：@ModelAttribute
    * */
    public String form1(@ModelAttribute() student stu, Model model){
        model.addAttribute("name",stu.getName());
        model.addAttribute("age",stu.getAge());
        model.addAttribute("id",stu.getAge());
        return "form/result";
    }
}
