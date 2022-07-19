package be.vdab.hoofdstuk4;

public class OmrekeningSeconden {
    public static void main(String[] args) {
        var aantalSeconden = 5924;

        var uren = aantalSeconden / 3600;
        var restSeconden = aantalSeconden % 3600;

        var minuten = restSeconden / 60;
        var seconden = restSeconden % 60;

        System.out.println("U:" + uren + " M:" + minuten + " S:"+ seconden);
    }
}
