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
    // Antall og pris må være større enn null
    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getAntall() {
        return antall;
    }

    public void setAntall(int antall) {
        if(antall > 0) {
            this.antall = antall;
        }
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        if(pris > 0) {
            this.pris = pris;
        }
    }

    // Metode for å beregne totalpris (pris * antall)
    public double beregneTotalPris() {
        double totalPris = getPris() * getAntall();
        return totalPris;
    }
}