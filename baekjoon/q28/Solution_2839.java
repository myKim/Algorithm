package my.baekjoon.q28;

import java.util.Scanner;

public class Solution_2839 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.close();

		int numOfBag = N / 5;
		int remainder = N % 5;

		if (remainder != 0) {
			while(numOfBag > 0 && (remainder % 3) != 0) {
				numOfBag--;
				remainder += 5;
			}
			if(remainder % 3 == 0) {
				numOfBag += (remainder / 3);
			}
			else {
				numOfBag = -1;
			}
		}
		
		System.out.println(numOfBag);
	}
}
