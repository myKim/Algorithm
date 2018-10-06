package my.baekjoon.q25;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution_2502 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		
		int[] dp = new int[D+1];

		int A = 0, B = 0;
		OUT: for(A=1; A<K; A++) {
			for(B=A; B<K; B++) {
				Arrays.fill(dp, 0);
				dp[1] = A;
				dp[2] = B;
				for(int i=3; i<dp.length; i++) {
					dp[i] = dp[i-1] + dp[i-2];
					if(dp[i] > K) {
						break;
					}
				}
				if(dp[D] == K) {
					break OUT;
				}
			}
		}
		
		System.out.println(A);
		System.out.println(B);
	}
}