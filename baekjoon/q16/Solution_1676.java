package my.baekjoon.q16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1676 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int cntTwo = 0;
		int cntFive = 0;
		for(int i=2; i<=N; i++) {
			int num = i;
			while(num%10 == 0) {
				cntTwo++;
				cntFive++;
				num /= 10;
			}
			while(num%5 == 0) {
				cntFive++;
				num /= 5;
			}
			while(num%2 == 0) {
				cntTwo++;
				num /= 2;
			}
		}
		
		System.out.print(Math.min(cntTwo, cntFive));
		
		br.close();
	}
	
}