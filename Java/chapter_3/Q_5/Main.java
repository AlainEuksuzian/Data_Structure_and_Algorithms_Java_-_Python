package chapter_3.Q_5;
import java.util.Scanner;
public class Main {
    private static Scanner keyboard = new Scanner(System.in);
    LinkedList_q5<HighScore> highScores = new LinkedList_q5<HighScore>();
    public static void main(String[] args) {
        
    }

    public void addScore(){
        String name = getUserInput("enter the name of the player: ");
        int score = Integer.parseInt(getUserInput("enter the score of the player: "));
        HighScore playerInfo = new HighScore(name, score);
        highScores.addHighScore(playerInfo);
    }

    public static String getUserInput(String message){
        System.out.print(message);
        return keyboard.nextLine();
    }
}
