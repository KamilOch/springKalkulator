package kalkulator;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class KalkulatorController {

    @RequestMapping("/")
    public String index() {
        return "Tu będzie kalkulator!!!!";
    }

    @RequestMapping("/kalkulator")
    public String wyswietlanie (){
        return "kalkulator_form";
    }


}