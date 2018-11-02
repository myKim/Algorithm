package my.baekjoon.q55;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_5543 {
	
	public static final int MAX_VALUE = 2000;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int hMin = MAX_VALUE;
		int dMin = MAX_VALUE;
		
		int cnt = 3;
		while(cnt-- > 0) {
			hMin = Math.min(hMin, Integer.parseInt(br.readLine()));
		}
		cnt = 2;
		while(cnt-- > 0) {
			dMin = Math.min(dMin, Integer.parseInt(br.readLine()));
		}
		
		System.out.print(hMin + dMin - 50);
		
		br.close();
	}
	
}