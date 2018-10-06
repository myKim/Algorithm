package my.baekjoon.q11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1100 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = 8;
		char[][] board = new char[N][];
		for(int i=0; i<N; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		int cnt = 0;
		for(int i=0; i<board.length; i++) {
			for(int j=(i&1); j<board[i].length; j+=2) {
				if(board[i][j] == 'F') {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		
		br.close();
	}
	
}