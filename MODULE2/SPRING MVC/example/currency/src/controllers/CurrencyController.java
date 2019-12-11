package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyController {
    @GetMapping("/cr2")
    public String cr2(@RequestParam String value, String currency, Model model){

        double sum;
        double currency_one = Double.parseDouble(value);
        if (currency.equals("USD")){
           sum = currency_one * 23000;
       } else {
           sum = currency_one/23000;
        }
        model.addAttribute("sum",sum);
        return "cr2";
    }
    @GetMapping("/currency")
    public String currency(){
        return "currency";
    }

}
