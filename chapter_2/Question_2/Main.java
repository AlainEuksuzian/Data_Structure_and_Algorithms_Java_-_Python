package chapter_2.Question_2;

/*PROGRAMMING PROJECT:
    * Write a Java program to simulate an ecosystem containing two types of creatures,
    bears and fish. The ecosystem consists of a river, which is modeled as a relatively
    large array. Each cell of the array should contain an Animal object, which can
    be a Bear object, a Fish object, or null.  <this part done
    In each time step, based on a random
    process, each animal either attempts to move into an adjacent array cell or stay
    where it is. If two animals of the same type are about to collide in the same
    cell, then they stay where they are, but they create a new instance of that type
    of animal, which is placed in a random empty (i.e., previously null) cell in the
    array. If a bear and a fish collide, however, then the fish dies (i.e., it disappears).
    Use actual object creation, via the new operator, to model the creation of new
    objects, and provide a visualization of the array after each time step
 * 
 */

 import java.util.Random;

public class Main {
    private static Animal[] riverEcosystem = new Animal[100];
    private static Random rand = new Random();
    public static void main(String[] args) {
        
        // test 50 runs
        int counter = 0;

        while(counter < 50){
            populateEcosystem();
            animalDecision();
            printEcosystem();
            System.out.println("_________________________________________________________________");
            counter++;
        }



    }

    /**
     * random number 0-1 if over 0.5: loops through :
     *  : if colision: another loop for first null to populate same as collision
     *  : if not null -> moves element by +1 
     *  : if not null and index i bear and index i+1 fish -> fill elimiated
     *                                              
     */
    public static void animalDecision(){
        double randomChoice = Math.random(); // [0-0.5[ -> stay, [0.5-1] -> move

        if (randomChoice >= 0.5){
            for (int i = 0; i < riverEcosystem.length - 1; i++){
                // if cell and cell + 1 are the same animal:
                if (riverEcosystem[i] != null && riverEcosystem[i].equals(riverEcosystem[i+1]) ){
                    if (riverEcosystem[i].getType() == "Fish"){
                        for (int k = 0; k < riverEcosystem.length; k++){
                            if (riverEcosystem[k] == null){
                                riverEcosystem[k] = new Fish();
                                break;
                            }
                        }
                    }
                    else if (riverEcosystem[i].getType().equals("Bear")){
                        for (int k = 0; k < riverEcosystem.length; k++){
                            if (riverEcosystem[k] == null){
                                riverEcosystem[k] = new Bear();
                                break;
                            }
                        }
                    }
                    
                }
                else if (riverEcosystem[i] != null && riverEcosystem[i+1] == null ){
                    riverEcosystem[i+1] = riverEcosystem[i];
                    riverEcosystem[i] = null;
                }

                else if ( riverEcosystem[i] != null && !riverEcosystem[i].equals(riverEcosystem[i+1])){
                    if (riverEcosystem[i].getType().equals("Bear") && riverEcosystem[i+1].getType().equals("Fish") ){
                        riverEcosystem[i+1] = null;
                    }
                }
            }
        }



    }

    /**
     * populates array of 100 based on 3 random choices between bear, fish and null
     */
    public static void populateEcosystem(){

        for (int i = 0; i < riverEcosystem.length; i++){
            int randomNumber = rand.nextInt(9); // 0,1,2 -> bear, 3,4,5->fish, 6,7,8-> numm
            if (randomNumber <= 2){
                riverEcosystem[i] = new Bear();
            }
            else if (randomNumber <= 5){
                riverEcosystem[i] = new Fish();
            }
            else {
                riverEcosystem[i] = null;
            }
        }
    }

    /**
     * prints array for visual
     */
    public static void printEcosystem(){
        for (Animal e: riverEcosystem){
            System.out.print(e + " , ");
        }
        System.out.println();
    }
}
