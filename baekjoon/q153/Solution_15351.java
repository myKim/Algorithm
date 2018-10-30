package my.baekjoon.q153;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_15351 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		while(N-- > 0) {
			char[] arr = br.readLine().toCharArray();
			
			int point = calPoint(arr);
			
			bw.write(point == 100 ? "PERFECT LIFE" : String.valueOf(point));
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}

	public static int calPoint(char[] arr) {
		int point = 0;
		
		for(char c : arr) {
			if('A'<=c && c<='Z') {
				point += (c - 'A' + 1);
			}
		}
		
		return point;
	}
}
