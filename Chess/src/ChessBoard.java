import java.util.Arrays;

public class ChessBoard {

    String[][] createChessBoard() {
        String[][] chessBoard =
                {{"1", "|", "R", "k", "B", "Q", "K", "B", "k", "R"},
                        {"2", "|", "P", "P", "P", "P", "P", "P", "P", "P"},
                        {"3", "|", " ", " ", " ", " ", " ", " ", " ", " "},
                        {"4", "|", " ", " ", " ", " ", " ", " ", " ", " "},
                        {"5", "|", " ", " ", " ", " ", " ", " ", " ", " "},
                        {"6", "|", " ", " ", " ", " ", " ", " ", " ", " "},
                        {"7", "|", "P", "P", "P", "P", "P", "P", "P", "P"},
                        {"8", "|", "R", "k", "B", "Q", "K", "B", "k", "R"},
                        {" ", "|", "-", "-", "-", "-", "-", "-", "-", "-"},
                        {" ", "|", "a", "b", "c", "d", "e", "f", "g", "h"}};

        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                System.out.print(chessBoard[i][j] + " ");
            }
            System.out.println();


        }
        System.out.println();
        return chessBoard;
    /*void printBoard(){

    }*/
    }
}
