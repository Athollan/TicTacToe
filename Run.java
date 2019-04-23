import java.util.Scanner;

class Run {
    public static boolean xTurn = true;
    static Scanner input = new Scanner(System.in);
    

    //gets coordinates from user and returns array of integers
    static int[] getCoords() {
        int[] coords = new int[2];
        try {
            System.out.println("please insert first coordinate");
            coords[0] = input.nextInt();
            System.out.println("please insert second coordinate");
            coords[1] = input.nextInt();
        } catch (Exception e) {
            System.out.println("enter one number at a time, must be between 0 & 2");
        }
        return coords;
    }


    // takes board as 2d array and coordinates given by user, then places piece on board
    static int[][] placePiece(int[][] _board, int[] _coords) {
        int[][] board = _board;
        int[] coords = _coords;


        // checks if coords selected is a blank spot, then places piece depending on the boolean
        if (board[coords[0]][coords[1]] == 0) {
            if(xTurn) {
                board[coords[0]][coords[1]] = -1;
            } else {
                board[coords[0]][coords[1]] = 1;
            }
        } else {
            System.out.println("this spot is taken");
        }
        return board;
    }


    static boolean[] checkForWinner(int[][] _board) {
        int[][] board = _board;
        boolean[] gameOn = {false, xTurn};
        boolean[] gameDone = {true, false};
 

        for (int i = 0; i < 3; i++) {
            if (board[i][0] != 0) {
                if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] == board[i][2]) {
                   return gameOn;
                }
            }
            if (board[0][i] != 0) {
                if(board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] == board[2][i]) {
                    return gameOn;
                }
            }
        }
        if (board[0][0] != 0) {
            if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] == board[2][2]) {
                return gameOn;
            }
        }
        if (board[2][0] != 0) {
            if (board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[2][0] == board[0][2]) {
                return gameOn;
            }
        } 
        xTurn = !xTurn;
        return gameDone; 
    }


    static int[][] displayBoard(int[][] _board) {
        int[][] board = _board;
        

        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        return board;
    }
}
