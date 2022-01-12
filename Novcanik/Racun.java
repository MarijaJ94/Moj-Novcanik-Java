package Novcanik;

public  class Racun {

    private String brojRacuna;
    private String valuta;
    private double stanje;

    public Racun (double stanje, String brojRacuna, String valuta){
        this.stanje=stanje;
        this.brojRacuna=brojRacuna;
        this.valuta=valuta;

    }
    public Racun(String brojRacuna){
        this.brojRacuna=brojRacuna;
    }

    public String getBrojRacuna() {
        return brojRacuna;
    }

    public String getValuta() {
        return valuta;
    }

    public double getStanje() {
        return stanje;
    }

    public void setValuta(String valuta) {
        this.valuta = valuta;
    }

    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public void setStanje(double stanje) {
        this.stanje = stanje;
    }
    public String toString(){
        StringBuilder sb= new StringBuilder();

        sb.append("Stanje racuna je: ");
        sb.append("\n");
        sb.append(stanje);
        sb.append("Broja racuna je: ");
        sb.append("\n");
        sb.append(brojRacuna);
        sb.append("\n");
        sb.append("Trenutno stanje je izrazeno u: ");
        sb.append(valuta);
        sb.append("\n");
         return sb.toString();

    }


}
