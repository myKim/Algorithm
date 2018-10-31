package my.baekjoon.q93;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_9316 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		for(int i=1; i<=N; i++) {
			bw.write("Hello World, Judge " + i + "!");
			bw.newLine();
		}
		
		bw.close();
		br.close();
	}
	
}
