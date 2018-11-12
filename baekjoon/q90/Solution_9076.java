package my.baekjoon.q90;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_9076 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		while(T-- > 0) {
			int[] score = new int[5];
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int i=0; i<score.length; i++) {
				score[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(score);
			
			if(score[score.length-2]-score[1] >= 4) {
				bw.write("KIN");
			}
			else {
				int sum = 0;
				for(int i=1; i<score.length-1; i++) {
					sum += score[i];
				}
				bw.write(String.valueOf(sum));
			}
			
			bw.newLine();
		}
		
		bw.close();
		br.close();
	}
	
}
