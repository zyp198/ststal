package com.ler.formparm;
import entry.student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
/*
*在SpringMVC 中，控制器Controller 负责处理由DispatcherServlet 分发的请求，它把用户请求的数据经过业务处理层处理之后封装成一个Model ，
*然后再把该Model 返回给对应的View 进行展示。在SpringMVC 中提供了一个非常简便的定义Controller 的方法，你无需继承特定的类或实现特定的接口
*只需使用@Controller 标记一个类是Controller ，然后使用@RequestMapping 和@RequestParam 等一些注解用以定义URL 请求和Controller 方法之间的映射，
*这样的Controller 就能被外界访问到。此外Controller 不会直接依赖于HttpServletRequest 和HttpServletResponse 等HttpServlet 对象，
*它们可以通过Controller 的方法参数灵活的获取到。
*/
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
