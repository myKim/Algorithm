package my.baekjoon.q159;

import java.util.Scanner;

public class Solution_15963 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextLong();
		
		System.out.println((N == M) ? 1 : 0);
		sc.close();
	}
}