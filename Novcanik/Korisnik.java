package Novcanik;

import java.util.ArrayList;

public class Korisnik {

    private String prezime;
    private String brojTelefona;
    private String brojRacuna;
    private String ime;
    private int lozinka;
    private static int NextPin=1;
    private int pin;

    public Korisnik(String ime, int lozinka, String prezime, String brojTelefona, String brojRacuna) {


        this.prezime = prezime;
        this.brojTelefona = brojTelefona;
        this.brojRacuna = brojRacuna;

        Racun novi=new Racun(brojRacuna);
        this.pin = pin;
        this.pin=NextPin;
        NextPin++;
    }
    public Korisnik(String ime, int lozinka, String prezime) {
        super();


        this.prezime = prezime;
        this.brojTelefona = brojTelefona;
        this.brojRacuna = brojRacuna;

        this.ime = ime;



        this.lozinka = lozinka;



        this.pin = pin;
        this.pin=NextPin;
        NextPin++;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getBrojTelefona() {
        return brojTelefona;
    }

    public String getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojTelefona(String brojTelefona) {
        this.brojTelefona = brojTelefona;
    }
    public int getLozinka() {
        return lozinka;
    }


    public int getPin() {
        return pin;
    }

    public void setLozinka(int lozinka) {
        this.lozinka = lozinka;
    }




}
