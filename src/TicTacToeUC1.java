import java.util.Scanner;
public class TicTacToeUC1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Player1, Enter your name");
        String p1 = in.nextLine();
        System.out.println("Player2, Enter your name");
        String p2 = in.nextLine();

        char[][] board = new char [3][3];

        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                board[i][j] = '-';
            }
        }

        //Draw board function
        drawBoard(board);



    }
    //printing out the board
    public static void drawBoard(char[][] board){
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
