package kalkulator;

public class Kalkulator {
    private Double wynikObliczen;


    public void dodawanieLiczb (Double pierwszaLiczba, Double drugaLiczba ){
        wynikObliczen = pierwszaLiczba + drugaLiczba;
    }

    public void odejmowanieLiczb (Double pierwszaLiczba, Double drugaLiczba ){
        wynikObliczen = pierwszaLiczba - drugaLiczba;
    }
    public void mnozenieLiczb (Double pierwszaLiczba, Double drugaLiczba ){
        wynikObliczen = pierwszaLiczba * drugaLiczba;
    }
    public void dzielenieLiczb (Double pierwszaLiczba, Double drugaLiczba ){
        wynikObliczen = pierwszaLiczba / drugaLiczba;
    }

    public Double getWynikObliczen() {
        return wynikObliczen;
    }
}
