package controller;

import model.Cal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controller {
    @GetMapping("/cal")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("index","cal",new Cal());
        return modelAndView;
    }
}
