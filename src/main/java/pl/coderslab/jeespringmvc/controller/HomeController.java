package pl.coderslab.jeespringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/home")
public class HomeController {
    @GetMapping({"", "/get"})
    public String home(){
        return "/home.jsp";
    }

    @PostMapping("/post")
    public String homePost(){
        return "home.jsp";
    }

    @GetMapping("/body")
    @ResponseBody
    public String homeBody(){
        return "/home.jsp";
    }

    @GetMapping(path="/encoding")
    @ResponseBody
    public String encoding(){
        return "ąęźśćółń";
    }
}
