package my.baekjoon.q83;

import java.util.Scanner;

public class Solution_8393 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int sum = 0;
		for(int i=1; i<=N; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
