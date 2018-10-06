package my.baekjoon.q111;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_11104 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		while(n-- > 0) {
			int res = Integer.valueOf(br.readLine(), 2);
			bw.write(String.valueOf(res));
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
}
