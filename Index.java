import java.util.Scanner;

class Index {
    //creates tic tac toe board
    static int[][] board =
    {
        {0, 0, 0},
        {0, 0, 0},
        {0, 0, 0},
    };
    static boolean[] winStats = new boolean[2];
    static boolean gameOn = false;


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Start startGame = new Start();
        Run runGame = new Run();
        //bug testing
        int error;

        gameOn = true;
        startGame.gameType();

        while (gameOn) {
            System.out.println("fixLoop");
            error = input.nextInt();
            runGame.displayBoard(board);
            board = runGame.placePiece(board, runGame.getCoords());
            winStats = runGame.checkForWinner(board);
            gameOn = winStats[0];
        }
    }
}
