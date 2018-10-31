package my.baekjoon.q55;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_5533 {

	private static final int GAME_CNT = 3; 
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[][] score = new int[N][3];
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<GAME_CNT; j++) {
				score[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0; i<N; i++) {
			int res = 0;
			for(int j=0; j<GAME_CNT; j++) {
				if(isUnique(score, i, j)) {
					res += score[i][j];
				}
			}
			System.out.println(res);
		}
		
		br.close();
	}
	
	public static boolean isUnique(int[][] score, int player, int round) {
		for(int i=0; i<score.length; i++) {
			if(i != player && score[i][round] == score[player][round]) {
				return false;
			}
		}
		return true;
	}
	
}