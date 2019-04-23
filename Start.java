import java.util.Scanner;

class Start {
    static Scanner input = new Scanner(System.in);
    static int[][] boardSpace = new int[3][3];
    static String selectGameType;
    static boolean gameOn = true;


    //fills each boardSpace with 0's (0 == an empty space) 
    static void makeBoard() {
        for (int i = 0; i < boardSpace.length; i++) {
            System.out.println();
            for (int j = 0; j < boardSpace.length; j++) {
                boardSpace[i][j] = 0;
                System.out.print(boardSpace[i][j]);
            }
        }
        System.out.println("\n");
    }


    //prompts player if it wants to play a comp or another human
    static boolean gameType() {
        System.out.println("please pick yout opponent,\neither \"Player\" or \"Computer\"");
        selectGameType = input.nextLine();

        
        // checks players preffered opponent
        if (selectGameType.equals("Player")) {
            return true;
        } else if (selectGameType.equals("Computer")) {
            return false;
        } else {
            System.out.println("you must type literally: Player or Computer, any other variation will not compute.\nplease try again");
            gameType();
        }
        return false;
    }
}
