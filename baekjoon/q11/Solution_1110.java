package my.baekjoon.q11;

import java.util.Scanner;

public class Solution_1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int num = N;
		int cycle = 0;
		
		do {
			int tmp = num / 10 + num % 10;
			num = (num % 10) * 10 + tmp % 10;
			cycle++;
		}
		while(num != N);
		
		System.out.println(cycle);
	}

}