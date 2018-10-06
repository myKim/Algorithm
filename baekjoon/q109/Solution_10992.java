package my.baekjoon.q109;

import java.util.Scanner;

public class Solution_10992 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		star(N);
	}
	
	public static void star(int N) {
		StringBuilder sb;
		for(int i=0; i<N-1; i++) {
			sb = new StringBuilder();
			for(int j=i; j<N-1; j++) {
				sb.append(" ");
			}
			sb.append("*");
			
			for(int j=0; j<(2*i-1); j++) {
				sb.append(" ");
			}
			if(i != 0) {
				sb.append("*");
			}
			System.out.println(sb.toString());
		}
		
		if(N > 0) {
			sb = new StringBuilder();
			for(int i=0; i<2*N-1; i++) {
				sb.append("*");
			}
			System.out.println(sb.toString());
		}
	}
	
}
