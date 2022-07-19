package be.vdab.hoofdstuk4;

import java.util.Scanner;

public class Snoepautomaat {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("kostprijs: ");
        var kostprijs = scanner.nextDouble();

        System.out.println("give me ingave ?");
        var ingave = scanner.nextInt();

        var terugGeldInCent = (int) ((ingave - kostprijs) * 100);

        System.out.println("Terug geld in cent : " + terugGeldInCent);
        var munt100 = terugGeldInCent / 100;
        var restGeld = terugGeldInCent % 100;
        var munt50 = restGeld / 50;
        restGeld %= 50;

        var munt20 = restGeld / 20;
        restGeld %= 20;

        var munt10 = restGeld /10;
        restGeld %= 10;

        var munt5 = restGeld /5;
        var munt1 = restGeld %5;

        System.out.println("Terug munten: ");
        System.out.println(munt100 + " * 1 Euro");
        System.out.println(munt50 + " * 50 cent");
        System.out.println(munt20 + " * 20 cent");
        System.out.println(munt10 + " * 10 cent");
        System.out.println(munt5 + " * 5 cent");
        System.out.println(munt1 + " * 1 cent");




    }
}
