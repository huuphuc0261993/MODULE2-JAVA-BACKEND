package controller;


import model.Cal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controller {
    @GetMapping("/cal")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("general", "cal", new Cal());
        return modelAndView;
    }

    @PostMapping("/cal")
    public ModelAndView select(@ModelAttribute("cal") Cal cal, @RequestParam("opera") String string) {
        cal.setCal(string);
        switch (string) {
            case "Addition(+)":
                cal.setResult(cal.getNum1() + cal.getNum2());
                break;
            case "Subtraction(-)": cal.setResult(cal.getNum1() - cal.getNum2());
                break;
            case "Division(/)":
                if (cal.getNum2() == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
//                    cal.setResult(0);
                } else {
                    cal.setResult(cal.getNum1() / cal.getNum2());
                }
                break;
            case "Multiplication(*)":
                cal.setResult(cal.getNum1() * cal.getNum2());
                break;
//            default:
//                throw new RuntimeException("Invalid operation");
        }
        ModelAndView modelAndView = new ModelAndView("index", "result", cal);
        return modelAndView;

    }

//    @PostMapping("/cal")
//    public ModelAndView select(@ModelAttribute("calculator") Cal cal, @RequestParam("rs") String string) {
//        cal.setCal(string);
//        switch (string) {
//            case "Addition(+)":
//                cal.setResult(cal.getNum1() + cal.getNum2());
//                break;
//            case "Subtraction(-)":
//                cal.setResult(cal.getNum1() - cal.getNum2());
//                break;
//            case "Division(/)":
//                if (cal.getNum2() == 0) {
//                    throw new ArithmeticException("Cannot divide by zero");
////                    cal.setResult(0);
//                } else {
//                    cal.setResult(cal.getNum1() / cal.getNum2());
//                }
//                break;
//            case "Multiplication(*)":
//                cal.setResult(cal.getNum1() * cal.getNum2());
//                break;
////            default:
////                throw new RuntimeException("Invalid operation");
//        }
//        ModelAndView modelAndView = new ModelAndView("index", "result", cal);
//        return modelAndView;
////        double select = calculator(string,num1,num2);
////        model.addAttribute("result",select);
////        return "index";
//    }

    }
//    @PostMapping("/cal")
//    public String select(@RequestParam("opera") String string, @RequestParam("num1") double num1, @RequestParam("num2") double num2, Model model) {
//        double select = calculator(string,num1,num2);
//        model.addAttribute("result",select);
//        return "index";
//    }
//
//    private double calculator(String string, double num1, double num2) {
//        switch (string) {
//            case "+":
//                return num1 + num2;
//            case "-":
//                return num1 - num2;
//            case "/":
//                if (num2 == 0) {
//                    throw new ArithmeticException("Cannot divide by zero");
//                } else {
//                    return num1 / num2;
//                }
//            case "*":
//                return num1 * num2;
//            default:
//                throw new RuntimeException("Invalid operation");
//        }
//    }




