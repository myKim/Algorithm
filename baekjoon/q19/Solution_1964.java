package my.baekjoon.q19;

import java.io.IOException;
import java.util.Scanner;

public class Solution_1964 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int[] dp = new int[N+1];
		
		dp[1] = 5;
		for(int i=2; i<dp.length; i++) {
			dp[i] = (dp[i-1] + (3*i+1)) % 45678;
		}
		
		System.out.println(dp[N]);
	}
}