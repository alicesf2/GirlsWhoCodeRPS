public class GameUtils {
    /**
     * method to check whether user wants to quit
     * @param input user input
     * @return true if the user typed quit, false if not
     */
    public static boolean isQuit(String input) {
        return input.trim().equalsIgnoreCase(Constants.QUIT);
    }

    /**
     * method to prompt the user to enter a move
     */
    public static void printEnterMove() {
        System.out.println(Constants.ENTER_MOVE);
    }

    /**
     * method to print the CPU move, the user move, and whether the user has won or not
     * @param input user input
     * @param cpuMove the CPU move
     */
    public static void printGameMoves(String input, int cpuMove) {
        if (input.trim().equalsIgnoreCase(Constants.ROCK)) {
            switch (cpuMove) {
                //compares player's move to cpu move (1 = rock, 2 = paper, 3 = scissors)
                case (1):
                    System.out.println(Constants.CPU_ROCK);
                    System.out.println(Constants.TIE);
                    break;
                case (2):
                    System.out.println(Constants.CPU_PAPER);
                    System.out.println(Constants.LOST);
                    break;
                case (3):
                    System.out.println(Constants.CPU_SCISSORS);
                    System.out.println(Constants.WON);
                    break;
            }
        } else if (input.trim().equalsIgnoreCase(Constants.PAPER)) {
            switch (cpuMove) {
                case (1):
                    System.out.println(Constants.CPU_ROCK);
                    System.out.println(Constants.WON);
                    break;
                case (2):
                    System.out.println(Constants.CPU_PAPER);
                    System.out.println(Constants.TIE);
                    break;
                case (3):
                    System.out.println(Constants.CPU_SCISSORS);
                    System.out.println(Constants.LOST);
                    break;
            }
        } else if (input.trim().equalsIgnoreCase(Constants.SCISSORS)) {
            switch (cpuMove) {
                case (1):
                    System.out.println(Constants.CPU_ROCK);
                    System.out.println(Constants.LOST);
                    break;
                case (2):
                    System.out.println(Constants.CPU_PAPER);
                    System.out.println(Constants.WON);
                    break;
                case (3):
                    System.out.println(Constants.CPU_SCISSORS);
                    System.out.println(Constants.TIE);
                    break;
            }
        } else {
            System.out.println(Constants.INVALID_MOVE);
        }
    }

    /**
     * method to generate a random integer from 1-3
     * @return a random integer from 1-3
     */
    public static int genRandomInt() {
        return (int)(Math.floor(Math.random() * 3)) + 1;
    }
}
