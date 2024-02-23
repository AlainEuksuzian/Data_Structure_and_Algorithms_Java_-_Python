package chapter_3.Q_6;

public class HighScore implements Comparable<HighScore> {
    
    private String playerName;
    private int playerScore;

    HighScore(){}

    HighScore(String name, int score){
        this.playerName = name;
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
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }
        else if (!(obj instanceof HighScore)){
            return false;
        }
        else {
            HighScore otherObj = (HighScore) obj;
            return this.getPlayerName().equalsIgnoreCase(otherObj.getPlayerName()) && this.getPlayerScore() == otherObj.getPlayerScore();
        }
    }

    @Override
    public String toString() {
        return "Player Name: " + this.getPlayerName() + "\nPlayer Score: " + this.getPlayerScore();
    }

    @Override
    public int compareTo(HighScore obj) {
       return this.getPlayerScore() - obj.getPlayerScore();
    }

}
