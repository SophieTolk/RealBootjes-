package bootjes.models;

public class Testdriver {

    public static void main(String[] args) {
        Verhuurder karel;
        int tochtNummer;
        CGTime eenDuur;
        int aantal;
        CGTime gemDuur;
        karel = new Verhuurder();
        tochtNummer = karel.startTocht();
        System.out.print("tocht gestart met nummer: ");
        System.out.println(tochtNummer);
        tochtNummer = karel.startTocht();
        System.out.print("tocht gestart met nummer: ");
        System.out.println(tochtNummer);
//Ingebouwde wachttijd van 5 seconden
        System.out.println("ben bezig");
        for (int i = 1; i <= 5; i = i + 1) {
            try {
                Thread.sleep(1000);
                System.out.print("..");
            } catch (InterruptedException e) {
            }
        }
        System.out.println();
        tochtNummer = 1;
        eenDuur = karel.beeindigTocht(tochtNummer);
        System.out.print("de tocht met nummer ");
        System.out.print(tochtNummer);
        System.out.print(" duurde ");
        System.out.println(eenDuur);
        aantal = karel.geefAantalBeeindigdeTochten();
        System.out.print("aantal beeindigde tochten is : ");
        System.out.println(aantal);
        gemDuur = karel.geefGemiddeldeDuur();
        System.out.print("gemiddelde duur is : ");
        System.out.println(gemDuur);
    }
}