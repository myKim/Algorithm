package my.level4;

import java.util.Scanner;

public class Solution_10817 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();
		
		int result = 0;
		if((B <= A && A <= C) || (C <= A && A <= B)) {
			result = A;
		}
		else if((A <= B && B <= C) || (C <= B && B <= A)) {
			result = B;
		}
		else {
			result = C;
		}
		System.out.println(result);
	}

}
