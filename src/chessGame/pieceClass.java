package chessGame;

public class pieceClass {
	
}
interface pieceInterface{
	public boolean isValidMove(int piecex, int piecey, int destx, int desty, String[][] board) ;
	public boolean canCheckKing(int piecex, int piecey);
	public void move(int piecex, int piecey, int destx, int desty, String[][] board);
	
}
