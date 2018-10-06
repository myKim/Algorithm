package my.baekjoon.q111;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_11179 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int result = 
				Integer.parseInt(new StringBuilder(Integer.toBinaryString(N)).reverse().toString(), 2);
		bw.write(String.valueOf(result));
		
		br.close();
		bw.close();
	}
	
}
