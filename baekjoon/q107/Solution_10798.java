package my.baekjoon.q107;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_10798 {
	
	private static final int LINE_CNT = 5;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char[][] board = new char[LINE_CNT][];
		int maxLen = 0;
		for(int i=0; i<LINE_CNT; i++) {
			board[i] = br.readLine().toCharArray();
			maxLen = Math.max(maxLen, board[i].length);
		}
		
		for(int i=0; i<maxLen; i++) {
			for(int j=0; j<LINE_CNT; j++) {
				if(i < board[j].length) {
					bw.write(board[j][i]);
				}
			}
		}
		
		br.close();
		bw.close();
	}
	
}
