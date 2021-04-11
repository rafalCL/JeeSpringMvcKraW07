package pl.coderslab.jeespringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;

// Utwórz kontroler SessionController.
//Sprawdź czy w sesji jest zapisana wartość pod kluczem loginStart.
//Jeżeli jest zapisana wyświetl ją - skorzystaj z adnotacji @ResponseBody.
//Jeżeli nie ma wartości - wstaw bieżącą datę i godzinę.

@Controller
public class SessionController {
    @GetMapping("/session")
    @ResponseBody
    public String hello(HttpSession s){
        LocalDateTime loginStart = (LocalDateTime)s.getAttribute("loginStart");

        if (loginStart == null){
            s.setAttribute("loginStart", LocalDateTime.now());
        }

        return loginStart == null ? "Pierwsze wejście. Zapisano w sesji." : loginStart.toString();
    }
}
