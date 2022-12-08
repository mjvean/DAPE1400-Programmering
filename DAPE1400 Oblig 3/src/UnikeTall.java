// Oppgave gjort av Martin Johan Andersen Vean (s367115).

import javax.swing.*;

public class UnikeTall {
    // Deklarasjon av array for lagring av tilfeldige heltall
    static int[] talliste;

    // Konstruktør som mottar arrayets lengde som parameter og oppretter arrayet.
    public UnikeTall() {
        talliste = new int[8];
    }

    /* Metode som skal undersøke om et gitt tall finnes i arrayet fra før.
      Tallet det letes etter skal mottas som parameter.
      Metoden skal returnere true hvis tallet finnes i arrayet.
      Hvis ikke skal metoden returnere false. */
    public static boolean tallDuplikat(int tall) {
        for (int i = 0; i < talliste.length; i++) {
            if (tall == talliste[i]) {
                return true;
            }
        }
        return false;
    }

    /* Metode som skal fylle arrayet med tilfeldige tall mellom 100 og 999,
      begge grenser inkludert. Metoden skal gjøre dette på en måte
      som sikrer at alle tallene er forskjellige. Metoden skal ikke ha
      parametre og heller ikke returnere noen verdi.
      Tips bruk (int)(Math.random()*(900)+100); for å generere tallene mellom 100 og 999
    */
    public static void tilfeldigTall() {
        int random = 0;
        for (int i = 0; i < talliste.length; i++) {
            talliste[i] = (int) (Math.random() * (900) + 100);
            if (tallDuplikat(random) == true) {
                i--;
            } else {
                talliste[i] = random;
            }
        }
    }

    // Metode som finner og returnerer det minste tallet i arrayet.
    public static int min(int[] talliste) {
        int minste = talliste[0];
        for (int tall : talliste) {
            if (tall < minste) {
                minste = tall;
            }
        }
        return minste;
    }

    // Metode som finner og returnerer det største tallet i arrayet.
    public static int maks(int[] talliste) {
        int storste = talliste[0];
        for (int tall : talliste) {
            if (tall > storste) {
                storste = tall;
            }
        }
        return storste;
    }

    /*  Metode som beregner og returnerer den gjennomstnittlige verdien
      (double-verdi) av tallene i arrayet.  */
    public static double gjennomsnitt() {
        double gjennomsnitt = 0;
        for (int i = 0; i < talliste.length; i++) {
            gjennomsnitt = gjennomsnitt + talliste[i];
        }
        gjennomsnitt = (double) gjennomsnitt / talliste.length;
        return gjennomsnitt;
    }

    /* Metode som viser tallene i arrayet i en meldingsboks.
      I tillegg skal det, i meldingsboks, skrives ut
      opplysninger om hvilket tall som er minst, hvilket som er størst, og
      hva som er gjennomsnittsverdien, jfr bildet over. Gjennomsnittverdien
      skal skrives ut med en desimal. Bruk gjerne String.format("%.2f,tall) til dette.
      Legg inn mellomrom mellom tallene og skriv ut et passende antall tall
      per linje. */
    public static void meldingsboks() {
        String output = "Array:"+"\n"+talliste+"Minste tallet er "+min(talliste)+"\n"+"Største tallet er "+maks(talliste)+"\n"+
                        "Gjennomsnittsverdien er "+String.format("%.2f", gjennomsnitt());
        for (int i = 0; i < talliste.length; i++) {
            if (i % 5 == 0) {
                output += "\n";
            }
        }
        JOptionPane.showMessageDialog(null, output);
    }
}