import java.util.Scanner;

public class Move {
    Scanner input = new Scanner(System.in);

    String player1(){
        System.out.print("player 1's move: ");
        String p1Move = input.nextLine();

        return p1Move;
    }
}
