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
/*
        if (pierwszaLiczba != null && !pierwszaLiczba.isEmpty()){
            wynikObliczen = pierwszaLiczba / drugaLiczba;
        } else {
            wynikObliczen = Double.parseDouble("Nie mozna dzielic przez ZERO!!!");
        }
*/

  //    /*
       if (drugaLiczba ==0){
            wynikObliczen = Double.valueOf("Nie mozna dzielic przez ZERO!!!");
        } else if (pierwszaLiczba == null || drugaLiczba == null) {
            wynikObliczen = Double.valueOf("costam");
        } else {
            wynikObliczen = pierwszaLiczba / drugaLiczba;
        }
    //    */
    }


    public String getWynikObliczen() {
        return String.valueOf(wynikObliczen);
    }
}
