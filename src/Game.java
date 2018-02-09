import java.util.Scanner;

/**
 * class for implementing a rock paper scissors game
 */
public class Game {

    /**
     * main method to run the game
     * @param args arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        printEnterMove();
        input = scanner.nextLine();

        while (!isQuit(input)) {
            if (isQuit(input)) {
                System.exit(0);
            }
            int cpuMove = genRandomInt();
            printGameMoves(input, cpuMove);
            printEnterMove();
            input = scanner.nextLine();
        }
        System.exit(0);
    }

    /**
     * method to check whether user wants to quit
     * @param input user input
     * @return true if the user typed quit, false if not
     */
    private static boolean isQuit(String input) {
        return input.equalsIgnoreCase(Constants.QUIT);
    }

    /**
     * method to prompt the user to enter a move
     */
    private static void printEnterMove() {
        System.out.println(Constants.ENTER_MOVE);
    }

    /**
     * method to print the CPU move, the user move, and whether the user has won or not
     * @param input user input
     * @param cpuMove the CPU move
     */
    private static void printGameMoves(String input, int cpuMove) {
        if (input.equalsIgnoreCase(Constants.ROCK)) {
            if (cpuMove == 1) {
                System.out.println(Constants.CPU_ROCK);
                System.out.println(Constants.TIE);
            } else if (cpuMove == 2) {
                System.out.println(Constants.CPU_PAPER);
                System.out.println(Constants.LOST);
            } else if (cpuMove == 3) {
                System.out.println(Constants.CPU_SCISSORS);
                System.out.println(Constants.WON);
            }
        } else if (input.equalsIgnoreCase(Constants.PAPER)) {
            if (cpuMove == 1) {
                System.out.println(Constants.CPU_ROCK);
                System.out.println(Constants.WON);
            } else if (cpuMove == 2) {
                System.out.println(Constants.CPU_PAPER);
                System.out.println(Constants.TIE);
            } else if (cpuMove == 3) {
                System.out.println(Constants.CPU_SCISSORS);
                System.out.println(Constants.LOST);
            }
        } else if (input.equalsIgnoreCase(Constants.SCISSORS)) {
            if (cpuMove == 1) {
                System.out.println(Constants.CPU_ROCK);
                System.out.println(Constants.LOST);
            } else if (cpuMove == 2) {
                System.out.println(Constants.CPU_PAPER);
                System.out.println(Constants.WON);
            } else if (cpuMove == 3) {
                System.out.println(Constants.CPU_SCISSORS);
                System.out.println(Constants.TIE);
            }
        } else {
            System.out.println(Constants.INVALID_MOVE);
        }
    }

    /**
     * method to generate a random integer from 1-3
     * @return a random integer from 1-3
     */
    private static int genRandomInt() {
        return (int)(Math.floor(Math.random() * 3)) + 1;
    }
}
