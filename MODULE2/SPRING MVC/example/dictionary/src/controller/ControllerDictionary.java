package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class ControllerDictionary {
    @GetMapping("/dictionary")
    public String dic(@RequestParam String english, Model model){
        Map<String, String>dic = new HashMap<>();
        dic.put("hello","Xin chao");
        dic.put("how","The nao");
        dic.put("book","Quyen vo");
        dic.put("computer","May tinh");
        String result = dic.get(english);
        String str="";
    if (result!=null){
        str = result;
    }else {
        str = "Not found";
    }
    model.addAttribute("str1",str);
    return "result";

}
    @GetMapping("/dic")
    public String dic2(){
        return "dictionary";
    }
}
