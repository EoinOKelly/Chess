import java.util.Arrays;

public class ChessBoard {

    String[][] createChessBoard() {
        String[][] chessBoard =
                {{"1", " ", "R", "k", "B", "Q", "K", "B", "k", "R"},
                        {"2", " ", "P", "P", "P", "P", "P", "P", "P", "P"},
                        {"3", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                        {"4", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                        {"5", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                        {"6", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                        {"7", " ", "P", "P", "P", "P", "P", "P", "P", "P"},
                        {"8", " ", "R", "k", "B", "Q", "K", "B", "k", "R"},
                        {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", "a", "b", "c", "d", "e", "f", "g", "h"}};

        for (String[] strings : chessBoard) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();


        }
        System.out.println();
        return chessBoard;
    /*void printBoard(){

    }*/
    }
}
