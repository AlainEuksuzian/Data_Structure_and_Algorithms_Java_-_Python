package chapter_3.Q_5;

public class HighScore implements Comparable<HighScore> {
    private String playerName;
    private int playerScore;

    HighScore(){}

    HighScore(String name, int score){
        this.playerName =name;
        this.playerScore = score;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    @Override
    public int compareTo(HighScore o) {
        return this.getPlayerScore() - o.getPlayerScore();
    }

    @Override
    public String toString() {
        return "Player Name: " + getPlayerName() + "\nPlayer Score: " + getPlayerScore();
    }
}
