package kalkulator;

public class Kalkulator {
    private String wynikObliczen;


    public void dodawanieLiczb (Double pierwszaLiczba, Double drugaLiczba ){
        wynikObliczen = Double.toString(pierwszaLiczba + drugaLiczba);
    }

    public void odejmowanieLiczb (Double pierwszaLiczba, Double drugaLiczba ){
        wynikObliczen = Double.toString(pierwszaLiczba - drugaLiczba);
    }
    public void mnozenieLiczb (Double pierwszaLiczba, Double drugaLiczba ){
        wynikObliczen = Double.toString(pierwszaLiczba * drugaLiczba);
    }
    public void dzielenieLiczb (Double pierwszaLiczba, Double drugaLiczba ){

       if (drugaLiczba ==0){
            wynikObliczen = "Nie mozna dzielic przez ZERO!!!";
        } else if (pierwszaLiczba == null) {
           wynikObliczen = "Nie podałeś pierwszej liczby!";
        } else if (drugaLiczba == null) {
           wynikObliczen = "Nie podałeś drugiej liczby!";
        } else {
            wynikObliczen = Double.toString(pierwszaLiczba / drugaLiczba);
        }

    }


    public String getWynikObliczen() {
        return String.valueOf(wynikObliczen);
    }
}
