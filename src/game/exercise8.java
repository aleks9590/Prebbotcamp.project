package game;
import java.util.Scanner;
//8) Next step is to figure out what to program.
// Discuss main algorithm /logic, data structures you will use and how
//will your program work. You can also write pseudocode if you want to.
// (https://www.geeksforgeeks.org/how-to-write-a-pseudo-code/).
public class exercise8 {
    public static void main(String[] args) {
        char [] [] board = {{' '}, {'|'}, {' '}, {'|'}, {' '},
                    {'-', '+', '-', '+', '-'},
                    {' '}, {'|'}, {' '}, {'|'}, {' '},
                    {' '}, {'|'}, {' '}, {'|'}, {' '},
                    {' '}, {'|'}, {' '}, {'|'}, {' '}};

        printTheGameBoard(board);

        Scanner scan = new Scanner (System.in);
        System.out.print("Enter your place (1-9): ");
        int place = scan.nextInt();

        System.out.println(place);

           switch(place)

    {
        case 1:
            board[0][0] = 'X';
            break;
        case 2:
        board[0][2] = 'X';
        break;
        case 3:
        board[0][4] = 'X';
        break;
        case 4:
        board[2][0] ='X';
        break;
        case 5:
        board[2][2] ='X';
        break;
        case 6:
        board[2][4] ='X';
        break;
        case 7:
        board[4][0] ='X';
        break;
        case 8:
        board[4][2] ='X';
        break;
        case 9:
        board[4][4] ='X';
        break;
    }
    printTheGameBoard(board);
}
    public static void printTheGameBoard(char[][] board) {
        for (char[]row : board) {
            for(char symbol :row){
                System.out.println(symbol);
            }
        }

    }
}
