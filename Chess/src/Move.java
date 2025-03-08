import java.util.Scanner;

public class Move {
    String move;
    Scanner input = new Scanner(System.in);

    String player1(){
        System.out.print("player 1's move: ");
        return input.nextLine();
    }

    String player2(){
        System.out.print("player 2's move: ");
        return input.nextLine();
    }

    void playerTurns(String move){
        Boolean who = true;

        while(true){
            if (who.equals(true)){
                move = player1();
                who = false;
            }
            else if (who.equals(false)) {
                move = player2();
                who = true;
            }
            else {
                break;
            }
        }

    }

    /*int[][] processMove() {

        String regex = "^[a-h][1-8] to [a-h][1-8]$";

        //nt[][] position = regex;

   }*/
}
