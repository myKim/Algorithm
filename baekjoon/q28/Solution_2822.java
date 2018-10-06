package my.baekjoon.q28;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Solution_2822 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = 8;
		int[] score = new int[N];
		for(int i=0; i<score.length; i++) {
			score[i] = Integer.parseInt(br.readLine());
		}
		
		int fifthScore = getScore(score, 5);
		int sum = 0;
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<score.length; i++) {
			if(fifthScore <= score[i]) {
				sum += score[i];
				sb.append((i+1) + " ");
			}
		}
		bw.write(String.valueOf(sum));
		bw.newLine();
		bw.write(sb.toString());
		
		br.close();
		bw.close();
	}
	
	public static int getScore(int[] arr, int n) {
		int[] tmp = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			tmp[i] = arr[i];
		}
		Arrays.sort(tmp);
		return tmp[tmp.length-n];
	}
}