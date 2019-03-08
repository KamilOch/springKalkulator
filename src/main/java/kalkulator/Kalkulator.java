package kalkulator;

public class Kalkulator {

  private String wynikObliczen;

  public synchronized boolean sprawdzeniePodaniaLiczb (Double pierwszaLiczba, Double drugaLiczba){
        if (pierwszaLiczba == null) {
            wynikObliczen = "Nie podałeś pierwszej liczby!";
            return false;
        } else if (pierwszaLiczba != null && drugaLiczba == null) {
            wynikObliczen = "Nie podałeś drugiej liczby!";
            return false;
        }
        return true;
    }

   public synchronized boolean sprawdzenieDzieleniaPrzezZEro (Double drugaLiczba){
        if (drugaLiczba == 0) {
            wynikObliczen = "Nie mozna dzielic przez ZERO!!!";
            return false;
        }
        return true;
    }

    public synchronized void dodawanieLiczb (Double pierwszaLiczba, Double drugaLiczba ){
        if (sprawdzeniePodaniaLiczb(pierwszaLiczba, drugaLiczba)) {
            wynikObliczen = Double.toString(pierwszaLiczba + drugaLiczba);
        }
    }

    public synchronized void odejmowanieLiczb (Double pierwszaLiczba, Double drugaLiczba ){

        if (sprawdzeniePodaniaLiczb(pierwszaLiczba, drugaLiczba)) {
            wynikObliczen = Double.toString(pierwszaLiczba - drugaLiczba);
        }
    }
   public synchronized void mnozenieLiczb (Double pierwszaLiczba, Double drugaLiczba ){
        if (sprawdzeniePodaniaLiczb(pierwszaLiczba, drugaLiczba)) {
            wynikObliczen = Double.toString(pierwszaLiczba * drugaLiczba);
        }
    }

    public synchronized void dzielenieLiczb(Double pierwszaLiczba, Double drugaLiczba) {
        if (sprawdzeniePodaniaLiczb(pierwszaLiczba, drugaLiczba) && sprawdzenieDzieleniaPrzezZEro(drugaLiczba)) {
            wynikObliczen = Double.toString(pierwszaLiczba / drugaLiczba);
        }
    }

    public synchronized String getWynikObliczen() {
        return String.valueOf(wynikObliczen);
    }
}
