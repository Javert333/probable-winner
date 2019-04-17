package chessGame;
import java.util.*;
public class game {
	public static void main(String[] args) {
		Scanner kbReader=new Scanner(System.in);
		ChessBoard gameBoard=new ChessBoard();
		gameBoard.fillBoard();
		gameBoard.printBoard();
		int piecex;
		int piecey;
		int destx;
		int desty;
		//pawn pawn1=new pawn();
		do {
			piecex=kbReader.nextInt();
			piecey=kbReader.nextInt();
			destx=kbReader.nextInt();
			desty=kbReader.nextInt();
			gameBoard.makeMove(piecex, piecey, destx, desty);
			gameBoard.printBoard();
			gameBoard.makeRandomMove();
			gameBoard.printBoard();
			
		}while(true);
	}
	
	
	
}


