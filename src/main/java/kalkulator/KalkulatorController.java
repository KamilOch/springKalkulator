package kalkulator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class KalkulatorController {





    @RequestMapping("/kalkulator_form")
    public String obliczenia (

    ) {

        Kalkulator kalkulator = new Kalkulator (20.00, 10.00);
        kalkulator.dodawanieLiczb(10.00,15.00);
        System.out.println(kalkulator.dodawanieLiczb(10.00,15.00));
        return "costam";
    }


    @RequestMapping("/")
    public String wyswietlanie (){
        return "kalkulator_form";
    }


}