package kalkulator;

public class Kalkulator {

  public String noweObliczenia (Double pierwszaLiczba, Double drugaLiczba, String dzialanie){

      if (dzialanie.equals("dodawanie")) {
          return dodawanieLiczb(pierwszaLiczba, drugaLiczba);

      } else if (dzialanie.equals("odejmowanie")) {
          return odejmowanieLiczb(pierwszaLiczba, drugaLiczba);

      } else if (dzialanie.equals("mnozenie")) {
          return mnozenieLiczb(pierwszaLiczba, drugaLiczba);

      } else if (dzialanie.equals("dzielenie")) {
          return dzielenieLiczb(pierwszaLiczba, drugaLiczba);

      } else return "dupa";
  }



  public boolean sprawdzeniePodaniaLiczb (Double pierwszaLiczba, Double drugaLiczba){
        if (pierwszaLiczba == null) {
    //        wynikObliczen = "Nie podałeś pierwszej liczby!";
            return false;
        } else if (pierwszaLiczba != null && drugaLiczba == null) {
    //        wynikObliczen = "Nie podałeś drugiej liczby!";
            return false;
        }
        return true;
    }

   public boolean sprawdzenieDzieleniaPrzezZEro (Double drugaLiczba){
        if (drugaLiczba == 0) {
     //       wynikObliczen = "Nie mozna dzielic przez ZERO!!!";
            return false;
        }
        return true;
    }

    public String dodawanieLiczb (Double pierwszaLiczba, Double drugaLiczba ){
        if (sprawdzeniePodaniaLiczb(pierwszaLiczba, drugaLiczba)) {
            return Double.toString(pierwszaLiczba + drugaLiczba);
        } return "Nie podałeś liczby!";
    }

    public String odejmowanieLiczb (Double pierwszaLiczba, Double drugaLiczba ){

        if (sprawdzeniePodaniaLiczb(pierwszaLiczba, drugaLiczba)) {
            return Double.toString(pierwszaLiczba - drugaLiczba);
        } return "Nie podałeś liczby!";
    }
   public String mnozenieLiczb (Double pierwszaLiczba, Double drugaLiczba ){
        if (sprawdzeniePodaniaLiczb(pierwszaLiczba, drugaLiczba)) {
            return Double.toString(pierwszaLiczba * drugaLiczba);
        } return "Nie podałeś liczby!";
    }

    public String dzielenieLiczb(Double pierwszaLiczba, Double drugaLiczba) {
        if (sprawdzeniePodaniaLiczb(pierwszaLiczba, drugaLiczba) && sprawdzenieDzieleniaPrzezZEro(drugaLiczba)) {
            return Double.toString(pierwszaLiczba / drugaLiczba);
        } return "Nie podałeś liczby! lub dzielisz przez zero!";
    }
}
