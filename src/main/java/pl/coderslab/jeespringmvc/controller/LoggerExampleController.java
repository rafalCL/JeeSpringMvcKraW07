package pl.coderslab.jeespringmvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/logger")
public class LoggerExampleController {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggerExampleController.class);

    @GetMapping("/log")
    public String log(){
        LOGGER.info("to jest info message");
        LOGGER.error("to jest error message");
        int a = 2;
        int b = 5;
        LOGGER.debug("a = {}, b = {} ", a, b);

        return "/home.jsp";
    }
}
