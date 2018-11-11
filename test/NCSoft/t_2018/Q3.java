package my.ncsoft.t_2018;

public class Q3 {

	public static void main(String[] args) {
		
		Q3 q3 = new Q3();
		int[][] board = {{1,1,3,3},{4,1,3,4},{1,2,1,1},{2,1,3,2}};
		
		int res = q3.solution(board);
		System.out.println(res);
		
	}

	public int solution(int[][] board) {
		int answer = 0;
		
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[i].length; j++) {
				answer = Math.max(answer, calPoint(board, i, j));
			}
		}
		
		return answer;
	}
	
	private int calPoint(int[][] board, int x, int y) {
		int point = 0;
		int[][] tmpBoard = new int[board.length][board[0].length];
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[0].length; j++) {
				tmpBoard[i][j] = board[i][j];
			}
		}
		
		boolean[][] isCrush = new boolean[board.length][board[0].length];
		isCrush[x][y] = true;
		while(enableCrush(isCrush)) {
			point += crush(tmpBoard, isCrush);
			isCrush = checkEnableCrush(tmpBoard);
		}
		
		return point;
	}
	
	private boolean[][] checkEnableCrush(int[][] board) {
		boolean[][] isCrush = new boolean[board.length][board[0].length];
		
		for(int i=0; i<board.length; i++) {
			for(int j=2; j<board[i].length; j++) {
				if(board[i][j] == 0) continue;
				
				if(board[i][j] == board[i][j-1] && board[i][j] == board[i][j-2]) {
					isCrush[i][j] = isCrush[i][j-1] = isCrush[i][j-2] = true;
				}
			}
		}
		for(int j=0; j<board[0].length; j++) {
			for(int i=2; i<board.length; i++) {
				if(board[i][j] == 0) continue;
				
				if(board[i][j] == board[i-1][j] && board[i-2][j] == board[i][j]) {
					isCrush[i][j] = isCrush[i-1][j] = isCrush[i-2][j] = true;
				}
			}
		}
		
		return isCrush;
	}
	
	private boolean enableCrush(boolean[][] isCrush) {
		for(boolean[] bArr : isCrush) {
			for(boolean b : bArr) {
				if(b) {
					return true;
				}
			}
		}
		return false;
	}
	
	private int crush(int[][] board, boolean[][] isCrush) {
		int point = 0;
		
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[i].length; j++) {
				if(isCrush[i][j]) {
					point++;
					board[i][j] = 0;
				}
			}
		}
		
		arrangeBoard(board);
		
		return point;
	}
	
	private void arrangeBoard(int[][] board) {
		for(int j=0; j<board[0].length; j++) {
			int last = board.length;
			for(int i=board.length-1; i>=0; i--) {
				if(board[i][j] > 0) {
					if(last > i+1) {
						board[last-1][j] = board[i][j];
						board[i][j] = 0;
						last = last-1;
					}
					else {
						last = i;
					}
				}
			}
		}
	}
	
}
