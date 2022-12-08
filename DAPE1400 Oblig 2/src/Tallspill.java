// Oppgave gjort av Martin Johan A. Vean, s367115

import javax.swing.*;

import static javax.swing.JOptionPane.*;

class Tallspill {

    private static int max = 200;
    private static final int min = 0;

    public int nyttTall() {
        // Trekker og returnerer et slumptall mellom 0 og 200.
        // Tips bruk : (int) (Math.random() * 201), som gir verdier mellom 0 og 200
        return (int)(Math.random()*201);
    }

    public void visMelding(String melding){
        // Viser parameterens innhold i en meldingsboks.
        JOptionPane.showMessageDialog(null, melding, null, PLAIN_MESSAGE);
    }

    private void forLite(int tall){
    /* Viser melding om at parameterens verdi er for
       lite tall og ber spilleren prøve igjen. */
        visMelding(tall + " er for lite. Prøv igjen!");
    }

    private void forStort(int tall) {
    /* Viser melding om at parameterens verdi er for
      stort tall og ber spilleren prøve igjen. */
        visMelding(tall + " er fort stort. Prøv igjen!");
    }

    public void avsluttRunde(int antall, int gjetning) {
    /* Viser melding om at det ble gjettet riktig
      og antall gjetninger som ble brukt.
      Parametrene gir opplysninger om dette. */
        visMelding(gjetning + " er riktig! \n Du gjettet riktig på " + antall + " forsøk.");
    }

    public void kjørSpill() {
    /* Kjører en spillrunde ved å trekke et tall,
      nullstille tellevariabel, innhente gjentatte
      gjetninger fra bruker inntil det gjettes riktig.
      Når det skjer, avsluttes runden med passe
      meldinger til spilleren. */
        int tall = nyttTall();
        int antallGjetninger = 0;
        int gjetning;

        do {
            gjetning = Integer.parseInt(JOptionPane.showInputDialog(null, "Jeg tenker på et tall mellom " +min + " og " + max + " \n Prøv å gjett tallet!"));
            antallGjetninger += 1;

            if (gjetning<tall) {
                forLite(gjetning);
            } else if (gjetning>tall) {
                forStort(gjetning);
            }
        }
        while (tall != gjetning);
        avsluttRunde(antallGjetninger, gjetning);
    }
}