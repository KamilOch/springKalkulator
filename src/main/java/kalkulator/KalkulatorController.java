package kalkulator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class KalkulatorController {





    @RequestMapping("/kalkulator_form")
    public String obliczenia (
            @RequestParam(value = "pierwszaLiczba", required = false) Double pierwsza,
            @RequestParam(value = "drugaLiczba", required = false) Double druga,
            @RequestParam(value = "dzialanie", required = false) String dzialanie,
            Model model
    ) {

        Kalkulator kalkulator = new Kalkulator ();


        if (dzialanie.equals("dodawanie")){
            kalkulator.dodawanieLiczb(pierwsza,druga);

        } else if (dzialanie.equals("odejmowanie")){
            kalkulator.odejmowanieLiczb(pierwsza,druga);

        } else if (dzialanie.equals("mnozenie")){
            kalkulator.mnozenieLiczb(pierwsza,druga);

        } else if (dzialanie.equals("dzielenie")) {
            kalkulator.dzielenieLiczb(pierwsza, druga);

        }
        System.out.println(kalkulator.getWynikObliczen());

        model.addAttribute("wynik" , kalkulator.getWynikObliczen());
        model.addAttribute("operaca" , "wybrane działanie to:  "+dzialanie);


        return "wynikDzialania";
    }


    @RequestMapping("/")
    public String wyswietlanie (){
        return "kalkulator_form";
    }


}