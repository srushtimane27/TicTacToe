
import java.util.Scanner;
public class TicTacToeUC4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //get players names
        System.out.println("Player 1 please enter your name ");
        String p1 = in.nextLine();
        System.out.println("Player 2 please enter your name ");
        String p2 = in.nextLine();

        //3*3 board
        //- empty space
        //x player1
        //o player2

        char[][] board = new char[3][3];

        //fill the board with dashes

        for (int i = 0; i < 3; i++) {            //index start at o, rows are3
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        //keep track on whose turn it is
        boolean isPlayer1 = true;
        //keeep track if the game has ended
        boolean gameEnded = false;

        while (!gameEnded) {

            //Draw board
          //  drawBoard(board);


            //keep track of what symbol we are using to play
            char symbol = ' ';
            if (isPlayer1) {
                symbol = 'x';
            } else {
                symbol = 'o';
            }
            //print out the players turn
            if (isPlayer1) {
                System.out.println(p1 + "Turn (x):");
            } else {
                System.out.println(p2 + "Turn (o):");

            }


            //Row and col variable
            int row = 0;
            int col = 0;

            while (true) {

                //get row and column from user
                System.out.print("Enter a row (0, 1, or 2):");
                row = in.nextInt();
                System.out.println("Enter a col (0, 1, or 2):");
                col = in.nextInt();

                //check if row and col are valid
                if (row < 0 || col < 0 || row > 2 || col > 2) {
                    //row and col are out of bounds
                    System.out.println("Row and columns are out of bound");
                } else if (board[row][col] != '-') {
                    //board position has an x or o
                    System.out.println("Someone has already made a move");
                } else {
                    //row and col are valid
                    break;
                }
            }

            //printing out the board
            (char[][] board){
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(board[i][j]);
                    }
                    System.out.println();
                }

            }

        }
    }
}


