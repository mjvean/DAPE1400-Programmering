// Oppgave gjort av Martin Johan A. Vean, s367115

import javax.swing.*;

public class Spilltest {
    // Oppretter et tallspill objekt hvor spillet kjøres gjentatte ganger frem til spilleren velger å avslutte spillet.

    public static final String[] JA_NEI_ALTERNATIV = {"Ja","Nei"};

    public static void main(String[] args) {

        Tallspill tallspill = new Tallspill();
        int svar;

        do {
            tallspill.kjørSpill();
            String[] alternativ = {"Ja","Nei"};
            svar = JOptionPane.showOptionDialog(null, "Vil du prøve en runde til?", "Gratulerer!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, alternativ, alternativ[0]);
        }
        while (svar == JOptionPane.YES_OPTION);

        JOptionPane.showMessageDialog(null, "Takk for spillet!");
    }
}