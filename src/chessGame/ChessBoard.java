package chessGame;

import java.util.ArrayList;

public class ChessBoard {
    String[][] board = new String[8][8];
    public void fillBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = " ";
            }
        }
        board [0][0] = "R";
        board [0][7] = "R";
        board [7][0] = "r";
        board [7][7] = "r";
        board [0][1] = "N";
        board [0][6] = "N";
        board [7][1] = "n";
        board [7][6] = "n";
        board [0][2] = "B";
        board [0][5] = "B";
        board [7][2] = "b";
        board [7][5] = "b";
        board [0][3] = "Q";
        board [7][3] = "q";
        board [0][4] = "K";
        board [7][4] = "k";
        for (int i = 0; i < 8; i++) {
            board[1][i] = "P";
            board[6][i] = "p";
        }
    }
    public void printBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j]); 
                System.out.print("|");
            }
            System.out.println();
            for (int j = 0; j < 8; j++) {
            	System.out.print("-"+" ");
            }
            System.out.println();
        }
    }
    public void makeMove(int piecex, int piecey, int destx, int desty) {
    	board[desty][destx]=board[piecey][piecex];
    	board[piecey][piecex]=" ";
    }
    public void makeRandomMove() {
    	ArrayList<moveCoor> allMoves=collectAllMoves();
    	moveCoor mv=selectAMove(allMoves);
    	makeMove(mv.piecex, mv.piecey,mv.destx, mv.desty);
    }
    public moveCoor selectAMove(ArrayList<moveCoor> allMoves) {
    	int leng=allMoves.size();
    	int pos=(int) (Math.random()*leng);
    	return allMoves.get(pos);
    }
    public ArrayList<moveCoor> collectAllMoves(){
    	ArrayList<moveCoor> allMoves=new ArrayList<moveCoor>();
    	for(int i=0;i<8;i++) {
    		for(int j=0;j<8;j++) {
    			if(board[i][j].equals("p")) {
    				if(board[i-1][j].equals(" ")) {
    					allMoves.add(new moveCoor(j,i-1,j,i));
    				}
    			}
    		}
    	}
    	
    	return allMoves;
    }
    
}
