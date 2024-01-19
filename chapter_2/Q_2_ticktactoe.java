package chapter_2;
import java.util.Scanner;

public class Q_2_ticktactoe{    
    private static Scanner keyboard = new Scanner(System.in);
    private static String[][] board = createBoard();
    public static void main(String[] args) {
            /*0,0 | 0,1 | 0,2
              1,0 | 1,1 | 1,2
              2,0 | 2,1 | 2,2 */
        
        int counter = 0;
        String value = "";

        while (true){
        
            if (counter % 2 == 0){
                value = "X";
            }
            else {
                value = "O";
            }
            playerMove(value, counter);

            if (isWinner()){
                break;
            }
            counter++;
            printBoard();
        }

        System.out.println();
        printBoard();

    }

    public static void playerMove(String value, int counter){
        String option = getUserInput(value +" turn, enter coordinates: "); 
        String[] location = option.split(",");
        int row = Integer.parseInt(location[0]);
        int col = Integer.parseInt(location[1]);
        
        while(board[row][col] != "_"){
            counter--;
            System.out.println("location already taken, try again: ");
            option = getUserInput(value +" turn, enter coordinates: "); 
            location = option.split(",");
            row = Integer.parseInt(location[0]);
            col = Integer.parseInt(location[1]);

        }
        board[row][col] = value;
    }

    private static String[][] createBoard(){

        String[][] board = new String[3][3];

        for (int i =0; i < board.length; i++){
            for (int k = 0; k < board[i].length; k++){
                board[i][k] = "_";
            }
        }
        return board;
    }

    private static void printBoard(){
        for (int i = 0; i < board.length; i++){
            for (int k = 0; k < board.length; k++){
                System.out.print(board[i][k]);
                
                if (k < 2){
                    System.out.print("|");
                }
            }
            System.out.println();
        }
    }

    public static boolean isWinner(){
        // horizon
        if ((board[0][0].equals(board[0][1]) && board[0][1].equals(board[0][2])) && !board[0][0].equals("_") ){
            System.out.println(board[0][0] + " wins");
            return true;
        }
        if ((board[1][0].equals(board[1][1]) && board[1][1].equals(board[1][2])) && !board[1][0].equals("_")){
            System.out.println(board[1][0] + " wins");
            return true;
        } 

        if ((board[2][0].equals(board[2][1]) && board[2][1].equals(board[2][2]))&& !board[2][0].equals("_")){
            System.out.println(board[0][0] + " wins");
            return true;
        }
         // end horizon
        //----------------------------------------------------------------------------------
         // START vertical
        if ((board[0][0].equals(board[1][0]) && board[1][0].equals(board[2][0])) && !board[0][0].equals("_")){
            System.out.println(board[0][0] + " wins");
            return true;
        }
        if ((board[0][1].equals(board[1][1]) && board[1][0].equals(board[2][1])) && !board[0][1].equals("_")){
            System.out.println(board[0][0] + " wins");
            return true;
        }
        if ((board[0][2].equals(board[1][2]) && board[1][0].equals(board[2][2]))&& !board[0][2].equals("_")){
            System.out.println(board[0][0] + " wins");
            return true;
        }
        // end vertical
        //---------------------------------------------------------------------------------------

         // end diagonal
        if ((board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) && !board[0][0].equals("_")){
            System.out.println(board[0][0] + " wins");
            return true;
        }
        if ((board[2][0].equals(board[1][1]) && board[1][1].equals(board[0][2])) && !board[2][0].equals("_")){
            System.out.println(board[0][0] + " wins");
            return true;
        }
        return false;
    }

    public static String getUserInput(String message){
        System.out.print(message);
        return keyboard.nextLine();
    }
}
