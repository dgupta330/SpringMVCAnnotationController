package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HomeController {
    @RequestMapping("/")
    public ModelAndView add()
    {
        ModelAndView mv=new ModelAndView();
        mv.setViewName("index");
        return mv;
    }


    @RequestMapping("add")
    public ModelAndView add(@RequestParam("t1") int i, @RequestParam("t2") int j, HttpServletRequest request, HttpServletResponse response)
    {
        int k=i+j;
        ModelAndView mv=new ModelAndView();
        mv.setViewName("index");
        mv.addObject("result",k);
        return mv;
    }
}
