package chessGame;

public class pawn implements pieceInterface{
	
	pawn(){
		int counter=0;
		int xcor;
		int ycor;
		
	}
	public boolean isValidMove(int piecex, int piecey, int destx, int desty, String[][] board) {
		if(board[piecey][piecex].equals("p")) {
			if(piecey-1<0)
				return false;
			if(!board[piecey-1][piecex].equals(" "))
				return false;
			if((piecey==6)&&((!board[piecey-1][piecex].equals(" "))||(!board[piecey-2][piecex].equals(null))))
				return false;
		}
		return true;
			
	}
	public boolean isValidKill(int piecex, int piecey, int destx, int desty, String [][] board) {
			char holdPiece=board[piecey][piecex].charAt(0);
			if(board[piecey][piecex].equals("p")) {
				if(piecex>destx) {
					if(board[piecey-1][piecex-1].equals(" ")) 
						return false;
					if(piecey-1<0)
						return false;
					if(piecex-1<0)
						return false;
					if(holdPiece>=65&&holdPiece<=90)
						return false;
					

					
				}
				if(piecex<destx) {
					
				}
			}
		return true;
	}
	public boolean canCheckKing(int piecex, int piecey) {
		return false;
	}
	public void move(int piecex, int piecey, int destx, int desty, String[][] board) {
		
		
	}
	
	
	
	
}
