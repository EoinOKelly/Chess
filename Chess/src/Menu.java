import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    ChessBoard make = new ChessBoard();

    Scanner input = new Scanner(System.in);

    void Options(){
        System.out.println("1. Play\n2. Quit");

        while(true){
            int choice = input.nextInt();
            if (choice == 1){
                String[][] board = make.createChessBoard();
            }
            else if (choice == 2) {
                break;
            }
    }
    }
}
