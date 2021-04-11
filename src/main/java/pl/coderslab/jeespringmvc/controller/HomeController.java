package pl.coderslab.jeespringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalTime;

@Controller
@RequestMapping("/home")
public class HomeController {
    @GetMapping({"", "/get"})
    public String home(Model m){
        String backgroundColor = "white";
        String textColor = "black";

        int hour = LocalTime.now().getHour();

        if(hour > 19 || hour < 9){
            backgroundColor = "black";
            textColor = "white";
        }

        m.addAttribute("backgroundColor", backgroundColor);
        m.addAttribute("textColor", textColor);

        return "home";
    }

    @PostMapping("/post")
    public String homePost(){
        return "home";
    }

    @GetMapping("/body")
    @ResponseBody
    public String homeBody(){
        return "home";
    }

    @GetMapping(path="/encoding")
    @ResponseBody
    public String encoding(){
        return "ąęźśćółń";
    }
}
