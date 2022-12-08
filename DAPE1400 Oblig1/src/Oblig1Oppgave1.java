// Oppgave gjort av Martin Johan Andersen Vean. Studentnummer: s367115

public class Oblig1Oppgave1 {

    public static void main(String[] args)  {

        // Variabel med verdi lik radius.
        double radius = 23.5;

        // Printer ut arealet av sirkelen. Kaller inn statisk metode fra Sirkel-klassen.
        System.out.println("Arealet av sirkelen med radius "+radius+" er "+Sirkel.beregnAreal(radius));

        // Printer ut omkretsen av sirkelen. Kaller inn statisk metode fra Sirkel-klassen.
        System.out.println("Omkretsen av sirkelen med radius "+radius+" er "+Sirkel.beregnOmkrets(radius));

        // Printer ut diameteren av sirkelen. Kaller inn statisk metode fra Sirkel-klassen.
        System.out.println("Diameteren til sirkelen med radius "+radius+" er "+Sirkel.beregnDiameter(radius));

    }
}