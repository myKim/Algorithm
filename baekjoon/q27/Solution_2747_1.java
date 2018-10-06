package my.baekjoon.q27;

import java.util.Scanner;

public class Solution_2747_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		System.out.println(fibonacci(n));
	}
	
	public static int fibonacci(int n) {
		if(n < 2) {
			return n;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}
}
