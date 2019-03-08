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
        // to było ok ale robimy eksperyment
       // Kalkulator kalkulator = new Kalkulator ();

        //start synchronizacji, obiektem jest kalkulator jest tylko 1 w programia :)
       // synchronized (kalkulator) {

            if (dzialanie.equals("dodawanie")) {
                kalkulator.dodawanieLiczb(pierwsza, druga);

            } else if (dzialanie.equals("odejmowanie")) {
                kalkulator.odejmowanieLiczb(pierwsza, druga);

            } else if (dzialanie.equals("mnozenie")) {
                kalkulator.mnozenieLiczb(pierwsza, druga);

            } else if (dzialanie.equals("dzielenie")) {
                kalkulator.dzielenieLiczb(pierwsza, druga);

            }
            System.out.println(kalkulator.getWynikObliczen());
            try {
                TimeUnit.MINUTES.sleep(1);
            } catch (InterruptedException ex) {

            }

            System.out.println(kalkulator.getWynikObliczen());

            model.addAttribute("wynik", kalkulator.getWynikObliczen());
            model.addAttribute("operaca", "wybrane działanie to:  " + dzialanie);

            // dotad mamy synchronizacje
    //}

        return "wynikDzialania";
    }


    @RequestMapping("/")
    public String wyswietlanie (){
        return "kalkulator_form";
    }


}