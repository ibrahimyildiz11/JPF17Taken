package be.vdab.hoofdstuk4;

import java.util.Scanner;

public class Bankrekeningnummer {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("give me een rekeningnummer: ");
        var rekeningnummer = scanner.nextLong();

        var eerste10 = rekeningnummer / 100;
        var laatste2 = rekeningnummer % 100;

        if (eerste10%97 == laatste2) {
            System.out.println("correct rekeningnummer!");
        } else {
            System.out.println("fout rekeningnummer!");
        }
    }
}
