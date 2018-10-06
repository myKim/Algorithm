package my.baekjoon.q89;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_8958 {

	public static void main(String[] args) throws IOException {
		// 1. Input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		char[][] TC = new char[N][];
		
		for(int i=0; i<N; i++) {
			TC[i] = br.readLine().toCharArray();
		}
		
		// 2. Solution
		for(int i=0; i<TC.length; i++) {
			bw.write(String.valueOf(getScore(TC[i])));
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
	public static int getScore(char[] input) {
		int score = 0;
		int bonus = 1;
		
		for(int i=0; i<input.length; i++) {
			if(input[i] == 'O') {
				score += (bonus++);
			}
			else {
				bonus = 1;
			}
		}
		return score;
	}
}
