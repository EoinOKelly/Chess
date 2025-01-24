public class Controller {
    ChessBoard make = new ChessBoard();
    Move move = new Move();

    void createBoard(){
        String[][] board = make.createChessBoard();
    }

}
