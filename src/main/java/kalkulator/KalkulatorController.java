package kalkulator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.concurrent.TimeUnit;

@Controller
public class KalkulatorController {
    // Jeden kalkulator dla wszystkich
    Kalkulator kalkulator;

    public KalkulatorController (){
        // Jeden kalkulator dla wszystkich
        kalkulator = new Kalkulator();
    }



    @RequestMapping("/kalkulator_form")
    public String obliczenia (
            @RequestParam(value = "pierwszaLiczba", required = false) Double pierwsza,
            @RequestParam(value = "drugaLiczba", required = false) Double druga,
            @RequestParam(value = "dzialanie", required = false) String dzialanie,
            Model model
    ) {

        model.addAttribute("wynik", kalkulator.noweObliczenia(pierwsza, druga, dzialanie));
        model.addAttribute("operaca", "wybrane działanie to:  " + dzialanie);

        return "wynikDzialania";
    }


    @RequestMapping("/")
    public String wyswietlanie (){
        return "kalkulator_form";
    }


}