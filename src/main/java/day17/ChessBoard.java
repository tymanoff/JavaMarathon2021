package day17;

public class ChessBoard {
    private ChessPiece[][] chessPiece;

    public ChessBoard(ChessPiece[][] chessPiece) {
        this.chessPiece = chessPiece;
    }

    public void print(){
        for(int i = 0; i < chessPiece.length; i++){
            for (int j = 0; j < chessPiece.length; j++){
                System.out.print(chessPiece[i][j]);
            }
            System.out.println();
        }
    }
    public void printMat(){
        for(ChessPiece[] cp: chessPiece){
            for (ChessPiece cp1: cp){
                System.out.print(cp1);
            }
            System.out.println();
        }
    }
}
