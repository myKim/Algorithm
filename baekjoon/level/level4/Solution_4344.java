package my.level4;

import java.util.Scanner;

public class Solution_4344 {

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
