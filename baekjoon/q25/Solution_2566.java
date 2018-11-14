package my.baekjoon.q25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_2566 {
    
	private static final int LENGTH = 9;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] board = new int[LENGTH+1][LENGTH+1];
		int maxValue = -1;
		int r = -1;
		int c = -1;
		
		for(int i=1; i<=LENGTH; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int j=1; j<=LENGTH; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
				
				if(maxValue < board[i][j]) {
					maxValue = board[i][j];
					r = i;
					c = j;
				}
			}
		}
		
		System.out.println(maxValue);
		System.out.println(r + " " + c);
		
		br.close();
	}

}