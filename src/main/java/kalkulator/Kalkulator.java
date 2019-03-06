package kalkulator;

public class Kalkulator {

    private Double pierwszaLiczba;
    private Double drugaLiczba;

    public Kalkulator (Double pierwszaLiczba,Double drugaLiczba ){
        this.pierwszaLiczba = pierwszaLiczba;
        this.drugaLiczba = drugaLiczba;
    }

    public Double dodawanieLiczb (Double pierwszaLiczba, Double drugaLiczba ){
        return pierwszaLiczba + drugaLiczba;
    }
}
