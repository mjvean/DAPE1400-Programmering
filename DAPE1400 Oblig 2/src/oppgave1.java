// Oppgave gjort av Martin Johan A. Vean, s367115

import javax.swing.*;

public class oppgave1 {

    public static void main(String[] args) {
        // Variabler som programmet skal bruke.
        int nedregrense = 0;
        int øvregrense = 0;
        int sum = 0;
        String printSum = "";

        // Åpner input dialog bokser slik at brukeren kan skrive inn nedre og øvre grense.
        nedregrense = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn nedre grense:"));
        øvregrense = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn øvre grense:"));

        for (int i=nedregrense; i<=øvregrense; i++) {
            sum += i;
            if (i !=øvregrense) {
                if (i%10==0) {
                    printSum += i+" + \n";
                }
                else {
                    printSum += i+" + ";
                }
            }
            else {
                printSum += i+" = "+sum;
            }
        }
        // Printer ut summen til konsoll.
        System.out.println(printSum);
    }
}