import java.util.Scanner;

/**
 * class for implementing a rock paper scissors game
 */
public class GameEngine {

    /**
     * main method to run the game
     * @param args arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //initial prompt for user move
        GameUtils.printEnterMove();
        String input = scanner.nextLine();

        while (!GameUtils.isQuit(input)) {
            //checks if the user wants to quit first
            if (GameUtils.isQuit(input)) {
                System.exit(0);
            }

            //runs and prints results of round
            int cpuMove = GameUtils.genRandomInt();
            GameUtils.printGameMoves(input, cpuMove);

            //takes in new input for next move
            GameUtils.printEnterMove();
            input = scanner.nextLine();
        }
        System.exit(0);
    }
}
