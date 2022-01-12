package Novcanik;

import java.util.ArrayList;
import java.util.Scanner;

public class TestNovcanik {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        // pravim korisnike, zatim ih dodajem u listu da bih mogla pomocu te liste da proveravam lozinku i ime prilikom logina

        Korisnik k1=new Korisnik("Pera",20000,"Pereci","20365455","24055684");

        Korisnik k2=new Korisnik("Jovana",25200,"Peci","99965455","24055255684");

        Korisnik k3=new Korisnik("Ivan",888200,"Jovic","111165455","240557885684");

        ArrayList<Korisnik> listaKorisnika=new ArrayList<Korisnik>();

        listaKorisnika.add(k1);
        listaKorisnika.add(k2);
        listaKorisnika.add(k3);

       boolean imePromenljive= Login.Login(listaKorisnika);

       if (imePromenljive==true){    // ako je login uspesan
           Funkcionalnosti.meni();   // pozivam funkciju meni iz koje korisnik moze da izabere jednu od 4 opcije
           int unos= sc.nextInt();   // uzimam sa tastature unos korisnika(koju opciju je izabrso)

           if (unos==1){   // provera da li je unos opcija 1. Takvih provera bi bilo jos 3 opcije i else (za sve ostale unose)
               System.out.println("Koliko novca zelite da uplatite na racun: ");
               double uplati= sc.nextDouble();
               //Funkcionalnosti.uplata(uplati);  metodi uplata treba proslediti suma "uplati" i ulogovanog korisnika
           }


       }

















    }
}
