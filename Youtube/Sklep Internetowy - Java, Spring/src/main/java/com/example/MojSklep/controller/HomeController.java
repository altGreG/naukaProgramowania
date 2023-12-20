package com.example.MojSklep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        /**
         * @GetMapping("/") sprawi że po wpisaniu http://www.mojaappka.pl/
         * zostanie wywołana funkcja home(),
         *
         *
         * @ResponseBody sprawi poskutkuje zwróceniem napisu po return
         */

        return "home";
    }

}
