package my.baekjoon.q30;

import java.io.IOException;
import java.util.Scanner;

public class Solution_3052 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = 10;
		int[] cnt = new int[42];
		
		int res = 0;
		while(N-- > 0) {
			int mod = sc.nextInt()%42;
			if(cnt[mod] == 0) {
				res++;
			}
			cnt[mod]++;
		}
		
		System.out.println(res);
		
		sc.close();	
	}
	
}