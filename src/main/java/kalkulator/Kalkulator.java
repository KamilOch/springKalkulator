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



  private boolean sprawdzeniePodaniaLiczb (Double pierwszaLiczba, Double drugaLiczba){
        if (pierwszaLiczba == null) {
            return false;
        } else if ( drugaLiczba == null) {
            return false;
        } return true;
    }

   private boolean sprawdzenieDzieleniaPrzezZEro (Double drugaLiczba){
        if (drugaLiczba == 0) {
            return false;
        } return true;
    }

    private String dodawanieLiczb (Double pierwszaLiczba, Double drugaLiczba ){
        if (sprawdzeniePodaniaLiczb(pierwszaLiczba, drugaLiczba)) {
            return Double.toString(pierwszaLiczba + drugaLiczba);
        } return "Nie podałeś liczby!";
    }

    private String odejmowanieLiczb (Double pierwszaLiczba, Double drugaLiczba ){

        if (sprawdzeniePodaniaLiczb(pierwszaLiczba, drugaLiczba)) {
            return Double.toString(pierwszaLiczba - drugaLiczba);
        } return "Nie podałeś liczby!";
    }
   private String mnozenieLiczb (Double pierwszaLiczba, Double drugaLiczba ){
        if (sprawdzeniePodaniaLiczb(pierwszaLiczba, drugaLiczba)) {
            return Double.toString(pierwszaLiczba * drugaLiczba);
        } return "Nie podałeś liczby!";
    }

    private String dzielenieLiczb(Double pierwszaLiczba, Double drugaLiczba) {
        if (sprawdzeniePodaniaLiczb(pierwszaLiczba, drugaLiczba) && sprawdzenieDzieleniaPrzezZEro(drugaLiczba)) {
            return Double.toString(pierwszaLiczba / drugaLiczba);
        } return "Nie podałeś liczby! lub dzielisz przez zero!";
    }
}
