package ies.estatuas;

public class ScoreCard {
    private final String color;
    private String redCorner = "";
    private String blueCorner = "";
    private String[] judgeScoreCard;


    public ScoreCard(String color) {
        this color = color;
    }

    public setRCorner(String boxerName) {
        this.redCorner = boxerName;
    }

    public setBCorner(String boxerName) {
        this.blueCorner = boxerName;
    }

    public byte getNumRounds()  {
        this
    }

    @Override
    public String toString() {
        return "\n\t\t\t   " + this.color
                + "\n\t\t" + this.blueCorner
                + "\t" + this.redCorner
                + "\n\t\t\t"
                + this.getNumRounds() + " rounds\n"
                + this.viewRounds()
                + "\n\t FINAL SCORE: "
                + this.getRedBoxerFinalScore()
                + " - "
                + this.getBlueBoxerFinalScore()
                + " FINAL SCORE";
    }

    public loadJudgeScoreCard(String[]) {

    }

    public byte getRedBoxerFinalScore() {
        if (this.getRedBoxerFinalScore == 0) {
            this.redBoxerFinalScore =
                    this.getRounds()
                            .stream()
                            .map(Round::getRedBoxerScore)
                            .map(Byte::intValue)
                            .reduce(0,Integer::sum)
                            .byteValue();
        }
        return this.redBoxerFinalScore;
    }

}