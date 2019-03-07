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
    public void dzielenieLiczb (Double pierwszaLiczba, Double drugaLiczba ) throws NullPointerException  {

       if (drugaLiczba ==0){
            wynikObliczen = Double.parseDouble("Nie mozna dzielic przez ZERO!!!");
        } else if (pierwszaLiczba == null || drugaLiczba == null) {
            wynikObliczen = Double.parseDouble("costam");
        } else {
            wynikObliczen = pierwszaLiczba / drugaLiczba;
        }
    }

    public Double getWynikObliczen() {
        return wynikObliczen;
    }
}
