package my.baekjoon.q20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_2011 {
	
	public static void main(String[] args) throws IOException {
		/******************************************
		 * 1. Input
		 ******************************************/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] input = br.readLine().toCharArray();
		
		
		/******************************************
		 * 2. Solution 
		 ******************************************/
		int[] dp = new int[input.length];
		int num1, num2;
		
		// 첫번째 숫자
		num1 = input[0]-'0';
		if(1 <= num1 && num1 <= 9) {
			dp[0] = 1;
		}
		if(input.length == 1) {
			System.out.println(dp[0]);
			return;
		}
		
		for(int i=1; i<input.length; i++) {
			num1 = input[i]-'0';
			num2 = (input[i-1]-'0') * 10 + input[i]-'0';
			
			if(1 <= num1 && num1 <= 9) {
				dp[i] += dp[i-1];
			}
			if(10 <= num2 && num2 <= 26) {
				if(i == 1) {
					dp[i] += 1;
				}
				else {
					dp[i] += dp[i-2];
				}
			}
			dp[i] %= 1000000;
		}
		System.out.println(dp[input.length-1]);
	}
}
