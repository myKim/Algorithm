package my.baekjoon.q10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1076 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int F = Integer.parseInt(br.readLine());
		
		N = N - (N % 100);
		int res = 0;
		for(int i=0; i<100; i++) {
			if(((N+i) % F) == 0) {
				res = i;
				break;
			}
		}
		
		System.out.printf("%02d", res);
		
		br.close();
	}
	
}