import java.util.Scanner;

public class TicTacToeUC2 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Player1, Enter your name");
        String p1 = in.nextLine();
        System.out.println("Player2, Enter your name");
        String p2 = in.nextLine();



        char[][] board = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        //Draw board function
        drawBoard(board);

        //choose from given symbol
        char player1;
        char player2;
        System.out.println("Player 1 choose choose letter x or o");
        String p3 = in.nextLine();
        System.out.println("Player 2 another character from player1");
        String p4 = in.nextLine();


    }

    //printing out the board
    public static void drawBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }

    }
}