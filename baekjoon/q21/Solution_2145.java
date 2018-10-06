package my.baekjoon.q21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_2145 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while(true) {
			int N = Integer.parseInt(br.readLine());
			if(N == 0) break;

			while(N > 9) {
				int tmp = N;
				N = 0;
				
				while(tmp > 0) {
					N += tmp % 10;
					tmp /= 10;
				}
			}
			
			bw.write(String.valueOf(N));
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
}