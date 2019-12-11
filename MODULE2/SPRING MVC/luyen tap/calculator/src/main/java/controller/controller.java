package controller;

import model.Cal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controller {
    @GetMapping("/cal")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("index", "cal", new Cal());
        return modelAndView;
    }

    @PostMapping("/cal")
    public ModelAndView select(@ModelAttribute("cal") Cal cal, @RequestParam("opera") String string) {
        switch (string) {
            case "Addition(+)":
                cal.setResult(cal.getNum1() + cal.getNum2());
                break;
            case "Subtraction(-)":
                cal.setResult(cal.getNum1() - cal.getNum2());
                break;
            case "Division(/)":
                if (cal.getNum2() == 0) {
                    throw new ArithmeticException("Canot divide by zero");
                } else {
                    cal.setResult(cal.getNum1() / cal.getNum2());
                }
                break;
            case "Multiplication(*)":
                cal.setResult(cal.getNum1() * cal.getNum2());
                break;
        }
        ModelAndView modelAndView = new ModelAndView("index","result",cal);
        return modelAndView;
    }
}


