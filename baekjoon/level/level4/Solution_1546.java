package my.level4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_1546 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		float[] score = new float[N];
		
		float M = -1;	// �ִ밪
		for(int i=0; i<score.length; i++) {
			score[i] = Float.parseFloat(st.nextToken());
			
			if(score[i] > M) M = score[i];
		}
		
		float sum = 0;
		float avg = 0;
		for(int i=0; i<score.length; i++) {
			sum += score[i] / M * 100;
		}
		avg = sum / score.length;
		
		bw.write(String.format("%.2f", avg));
		
		br.close();
		bw.close();
	}

}
