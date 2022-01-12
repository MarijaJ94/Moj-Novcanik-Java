package Novcanik;

public abstract class Funkcionalnosti {


    public static void uplata(double novac, Racun kojiRacun){
        double staroStanje=kojiRacun.getStanje();
        kojiRacun.setStanje(staroStanje+novac);


    }

    public static void isplata(double novac, Racun kojiRacun){
        double staroStanje=kojiRacun.getStanje();
        kojiRacun.setStanje(staroStanje-novac);

    }
    public static Racun kreirajRacun(double stanje, String brojRacuna, String valuta){

        Racun neki=new Racun(stanje, brojRacuna, valuta);
        return neki;
    }

    public static void obrisiRacun(Racun neki){
        neki=null;          // kada objektu "neki" dodelimo vrednost null onda programski jezik obrise sve reference na taj objekat
    }

    public static void meni(){

        StringBuilder sb = new StringBuilder();
        sb.append(" 1. Uplata");
        sb.append(" 2. Isplata");
        sb.append(" 3. Kreiraj racun");
        sb.append(" 4. Obrisi racun");

        System.out.println(sb.toString());




    }


    public static void ispisiKorisnika(Korisnik neki, Racun njegov){

            StringBuilder sb = new StringBuilder();
            sb.append(neki.getIme());
            sb.append("\n");
            sb.append(neki.getPrezime());
            sb.append("\n");
            sb.append(neki.getBrojTelefona());
            sb.append("\n");
            sb.append(neki.getBrojRacuna());
            sb.append("\n");
            sb.append(njegov.toString());

        System.out.println(sb.toString());
        }
    }




