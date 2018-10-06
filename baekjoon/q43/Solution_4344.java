package my.baekjoon.q43;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_4344 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		int C = Integer.parseInt(st.nextToken());
		
		while(C-- > 0) {
			st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int[] score = new int[N];
			
			int sum = 0;
			for(int i=0; i<score.length; i++) {
				score[i] = Integer.parseInt(st.nextToken());
				sum += score[i];
			}
			double avg = (double) sum / score.length;
			
			int cnt = 0;
			for(int s : score) {
				if(s > avg) {
					cnt++;
				}
			}
			
			bw.write(String.format("%.3f", (float) cnt / score.length * 100));
			bw.write("%\n");	
		}
		
		br.close();
		bw.close();
	}

}