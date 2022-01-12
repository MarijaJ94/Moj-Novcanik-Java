package Novcanik;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Login {
    static Scanner sc =new Scanner(System.in);


    public static boolean Login(ArrayList<Korisnik> listaSvihKorisnika) {

        /* u uvoj klasi prvo proveravamo da li korisnik ima nolog. Ako ga nema mora da se registruje.
        Ako ga ima onda se loguje pomocu lozinke i imena */


        StringBuilder sb=new StringBuilder();
        sb.append("Da li imate nalog?" +"\n"+"Moguci odgovori su da i ne."+"\n");
        System.out.println(sb.toString());

        String odgovor=sc.next();

        if (odgovor=="ne"){
            System.out.println("Unesite ime: ");
            String imeKorisnika=sc.next();

            System.out.println("Unesite prezime: ");
            String prezimeKorisnika=sc.next();

            System.out.println("Unesite lozinka: ");
            int lozinkaKorisnika=sc.nextInt();

            registracija(imeKorisnika,prezimeKorisnika,lozinkaKorisnika);



        }
        else if  (odgovor=="da"){
            System.out.println("Uloguj se: ");
            System.out.println("Unesi lozinku: ");
            int lozinkaKorisnika=sc.nextInt();
            System.out.println("Unesi ime: ");
            String imeKorisnika=sc.next();


            for (int i=0;i<listaSvihKorisnika.size();i++){
                Korisnik prvi= listaSvihKorisnika.get(i);
                if (lozinkaKorisnika == prvi.getLozinka()){
                    if (imeKorisnika == prvi.getIme()){

                        //treba da nekako vratim korisnika koji je ulogovan
                        return true;

                    }
                    else {
                        return false;
                    }

                }
                else {
                    return false;
                }

            }

        }

        else {
            sb.append("Uneli ste pogresan odgovor.");
        }

        return false;





    }





    public static void registracija(String ime, String prezime,int lozinka){
        Korisnik neki= new Korisnik(ime,lozinka,prezime);
    }


    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("Da li imate nalog?" +"\n"+"Moguci odgovori su da i ne."+"\n");
        String odgovor=sc.next();
        sb.append(odgovor);
        if (odgovor=="ne"){
            // registracija
        }
        else if  (odgovor=="da"){


        }

        else {
            sb.append("Uneli ste pogresan odgovor.");
        }
        return sb.toString();

    }

}
