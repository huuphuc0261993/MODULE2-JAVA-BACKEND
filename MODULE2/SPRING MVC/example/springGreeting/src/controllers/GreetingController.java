package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController{
    @GetMapping("/greeting")
    public String greeting(){
        return "greeting";
    }
    @GetMapping("/greeting2")
    public String greting2(@RequestParam String text, Model model){
        model.addAttribute("text",text);
        return "geeting2";
        //return luon tra ve muc view, ex: admin/getting2 (day la duong dan)
    }
}
