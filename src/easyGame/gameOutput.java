package easyGame;
import java.util.Scanner;

public class gameOutput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        game ticTacToe = new game();
        ticTacToe.createBoard();
        System.out.println("Welcome to Tic-tac-toe game!");

        do {
            System.out.println("Here is our board: ");
            ticTacToe.printBoard();
            int row;
            int col;

            do {
                System.out.println("Player" + ticTacToe.getPlayer() + ", enter Your numbers please! ");
                row = scan.nextInt() - 1;
                col = scan.nextInt() - 1;
            }
            while (!ticTacToe.placePlayer(row, col));
            ticTacToe.whoseTurn();
        }
        while (!ticTacToe.lookForWinner() && !ticTacToe.thereIsNoSpace());
        if (ticTacToe.thereIsNoSpace() && !ticTacToe.lookForWinner()) {
            System.out.println("It's a tie!");
        } else {
            System.out.println("Here is our board: ");
            ticTacToe.printBoard();
            ticTacToe.whoseTurn();
            System.out.println("Congratulations, " + ticTacToe.getPlayer() + " You win!");
        }
    }
}
