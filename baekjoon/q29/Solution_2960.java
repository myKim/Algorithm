package my.baekjoon.q29;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_2960 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		
		System.out.println(solution(N, K));
	}
	
	public static int solution(int N, int K) {
		boolean[] soe = new boolean[N+1];
		Arrays.fill(soe, true);
		soe[0] = false;
		soe[1] = false;
		int res = 0;
		
		int P = 2;
		int size = N;
		while(P <= size) {
			if(soe[P]) {
				if(--K == 0) {
					res = P;
				}
				
				for(int i=P*P; i<soe.length; i+=P) {
					if(soe[i]) {
						if(--K == 0) {
							res = i;
						}
						soe[i] = false;
					}
				}
			}
			P++;
		}
		return res;
	}
	
}
