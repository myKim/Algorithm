package my.baekjoon.q25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_2556 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			sb.append("*");
		}
		for(int i=0; i<N; i++) {
			bw.write(sb.toString());
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}

}
