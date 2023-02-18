// Oppgave gjort av Martin Johan Andersen Vean. Studentnummer: s367115

public class Sirkel {

    // Statisk metode som beregner og returnerer sirkelens diameter.
    public static double beregnDiameter(double radius) {
        double diameter = radius * 2;
        return diameter;
    }

    // Statisk metode som beregner og returnerer sirkelens omkrets.
    public static double beregnOmkrets(double radius) {
        double omkrets = Math.PI * 2*radius;
        return omkrets;
    }

    // Statisk metode som beregner og returnerer sirkelens areal.
    public static double beregnAreal(double radius) {
        double areal = Math.PI * Math.pow(radius, 2);
        return areal;
    }
}