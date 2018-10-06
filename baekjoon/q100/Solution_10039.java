package my.baekjoon.q100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_10039 {

	public static void main(String[] args) throws IOException {
		// 1. Input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] score = new int[5];
		for(int i=0; i<score.length; i++) {
			score[i] = Integer.parseInt(br.readLine());
		}
		
		// 2. Solution
		int sum = 0, avg = 0;
		for(int i=0; i<score.length; i++) {
			if(score[i] > 40)
				sum += score[i];
			else	// 40점 이하의 경우, 무조건 40점을 받는다.
				sum += 40;
		}
		avg = sum / score.length;
		
		// 3. Output
		bw.write(String.valueOf(avg));
		
		br.close();
		bw.close();
	}
}
