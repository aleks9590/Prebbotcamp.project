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

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your place (1-9): ");
        int place = scan.nextInt();

        System.out.println(place);
        }
}
