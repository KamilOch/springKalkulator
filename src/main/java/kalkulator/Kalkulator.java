package kalkulator;

public class Kalkulator {

    private Double pierwszaLiczba;
    private Double drugaLiczba;
    private Double wynikObliczen;

    public void dodawanieLiczb (Double pierwszaLiczba, Double drugaLiczba ){
        wynikObliczen = pierwszaLiczba + drugaLiczba;
    }

    public Double getWynikObliczen() {
        return wynikObliczen;
    }
}
