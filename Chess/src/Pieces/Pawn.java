package Pieces;

public class Pawn extends Pieces{
    @Override
    boolean canMove(int[] currentPos, int[] newPos, String[][] chessBoard){
        if(newPos[0] > 2 & newPos[1] < 9){
            if(newPos[1] > currentPos[1] & newPos[1] < currentPos[1] + 1){
                if(chessBoard[newPos[0]][newPos[1]].equals(" ")){
                    return true;
                }
            }
        }
        return false;
    }
}
