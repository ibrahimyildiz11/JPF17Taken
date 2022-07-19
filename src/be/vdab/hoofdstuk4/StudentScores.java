package be.vdab.hoofdstuk4;

public class StudentScores {
    public static void main(String[] args) {
        var score1 = 8D;
        var score2 = 6D;
        var score3 = 9D;
        var score4 = 4D;

        var gemiddelde = (score1+score2+score3+score4) / 4;

        var percentage = (gemiddelde * 100) / 10;

        System.out.println("gemiddelde : " + gemiddelde + " op 10");
        System.out.println("percentage : " + percentage + " %");

    }
}
