package my.level4;

import java.util.Scanner;

public class Solution_9498 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		char score = 0;
		
		if(N >= 90) score = 'A';
		else if(N >= 80) score = 'B'; 
		else if(N >= 70) score = 'C';
		else if(N >= 60) score = 'D';
		else score = 'F';
		
		System.out.println(score);
	}

}
