import java.util.Scanner;

public class Move {
    Scanner input = new Scanner(System.in);

    String player1(){
        System.out.print("player 1's move: ");
        return input.nextLine();
    }

    String player2(){
        System.out.print("player 2's move: ");
        return input.nextLine();
    }

    void playerTurns(){
        Boolean who = true;

        while(true){
            if (who.equals(true)){
                String p1 = player1();
                who = false;
            }
            else if (who.equals(false)) {
                String p2 = player2();
                who = true;
            }
            else{
                break;
            }
        }

    }
}
