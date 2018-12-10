import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_2447 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		char[][] board = new char[N][N]; 
		for(char[] arr : board) {
			Arrays.fill(arr, ' ');
		}
		
		solution(board, 0, 0, N);
		
		for(char[] arr : board) {
			System.out.println(arr);
		}
		
		br.close();
	}
	
	public static void solution(char[][] board, int x, int y, int size) {
		if(size == 1) {
			board[x][y] = '*';
			return;
		}
		
		int nextSize = size / 3;
		
		solution(board, x, y, nextSize);
		solution(board, x, y+nextSize, nextSize);
		solution(board, x, y+(nextSize*2), nextSize);
		solution(board, x+nextSize, y, nextSize);
//		solution(board, x+nextSize, y+nextSize, nextSize);
		solution(board, x+nextSize, y+(nextSize*2), nextSize);
		solution(board, x+(nextSize*2), y, nextSize);
		solution(board, x+(nextSize*2), y+nextSize, nextSize);
		solution(board, x+(nextSize*2), y+(nextSize*2), nextSize);
	}
	
}
