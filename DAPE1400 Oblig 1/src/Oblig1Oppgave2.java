// Oppgave gjort av Martin Johan Andersen Vean. Studentnummer: s367115

import javax.swing.*;

import static javax.swing.JOptionPane.*;

public class Oblig1Oppgave2 {

    public static void main(String[] args) {
        int antall_1 = 0;
        double pris_1 = 0;
        int antall_2 = 0;
        double pris_2 = 0;
        boolean nyttForsøk = true;

        // les inn navn, antall og pris for vare 1
        String navn_1 = JOptionPane.showInputDialog("Skriv inn navn på vare nummer én: ");

        // Try / Catch Vare nummer 1
        while (nyttForsøk) { // While løkke slik at programmet ikke går forbi antall_1
            nyttForsøk = false;
            try {
                antall_1 = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn antallet av vare nummer én: "));
                pris_1 = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn pris på antall varer av vare nummer én: "));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Vennligst skriv inn et gyldig tall.");
                nyttForsøk = true;
            }
        }

        // les inn navn, antall og pris for vare 2
        String navn_2 = JOptionPane.showInputDialog("Skriv inn navn på vare nummer to: ");

        // Try / Catch Vare nummer 2
            try {
                antall_2 = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn antallet av vare nummer to: "));
                pris_2 = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn pris på antall varer av vare nummer to: "));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Vennligst skriv inn et gyldig tall.");
            }

        // opprett to vare-objekter med de innleste verdiene
        Vare vare1 = new Vare(navn_1, antall_1, pris_1);
        Vare vare2 = new Vare(navn_2, antall_2, pris_2);

        // Beregner totalprisen av begge varer.
        double totalPris = vare1.beregneTotalPris() + vare2.beregneTotalPris();
        String ut = "Totalprisen for alle varene samlet er " + totalPris + " kr.";

        // Printer ut totalprisen av begge varer.
        System.out.print(ut);
    }
}