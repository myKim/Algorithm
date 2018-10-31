package my.baekjoon.q55;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_5576 {

	private static final int PERSON_CNT = 10;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[][] score = new int[2][PERSON_CNT];
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<PERSON_CNT; j++) {
				score[i][j] = Integer.parseInt(br.readLine());
			}
			Arrays.sort(score[i]);
		}
		
		int A = score[0][9]+score[0][8]+score[0][7];
		int B = score[1][9]+score[1][8]+score[1][7];
		
		System.out.print(A + " " + B);
		
		br.close();
	}
	
}