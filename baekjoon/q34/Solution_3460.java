package my.baekjoon.q34;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_3460 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int i = 0;
			int mask = 1;
			
			while(mask <= n) {
				if((n & mask) != 0) {
					bw.write(i + " ");
				}
				mask <<= 1;
				i++;
			}
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
}
