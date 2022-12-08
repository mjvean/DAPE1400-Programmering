// Oppgave gjort av Martin Johan Andersen Vean. Studentnummer: s367115

public class Vare {
    private String navn;
    private int antall;
    private double pris;

    // Konstruktør med alle attributter
    public Vare(String navn, int antall, double pris) {
        this.navn = navn;
        this.antall = antall;
        this.pris = pris;
    }

    // Get / Set metoder
    public String getNavn() {
        return navn;
    }

    public void setNavn() {
        this.navn = navn;
    }

    public int getAntall() {
        return antall;
    }

    public void setAntall() {
        this.antall = antall;
    }

    public double getPris() {
        return pris;
    }

    public void setPris() {
        this.pris = pris;
    }
    // Antall og pris må være større enn null



    // Metode for å beregne totalpris (pris * antall)
    public double beregneTotalPris() {
        return pris * antall;
    }

}