package pl.coderslab.jeespringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class RandomController {
    private Random random = new Random(System.currentTimeMillis());

    @RequestMapping("/random/{max}")
    @ResponseBody
    public String randomMax(@PathVariable int max){
        return String.valueOf(random.nextInt(max) + 1);
    }

    @RequestMapping("/random/{min}/{max}")
    @ResponseBody
    public String randomMinMax(@PathVariable int min, @PathVariable int max){
        return String.valueOf(random.nextInt(max-min+1) + min);
    }
}
