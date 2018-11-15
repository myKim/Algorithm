package my.baekjoon.q109;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_10995 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		System.out.print(star(N));
		
		br.close();
	}
	
	public static String star(int N) {
		StringBuilder sb1 = new StringBuilder();
		for(int i=1; i<=2*N-1; i++) {
			if((i&1) == 0) { // Â¦¼ö
				sb1.append(' ');
			}
			else { // È¦¼ö
				sb1.append('*');
			}
		}
		
		StringBuilder sb2 = new StringBuilder();
		for(int i=1; i<=N; i++) {
			if((i&1) == 0) { // Â¦¼ö
				sb2.append(' ');
			}
			sb2.append(sb1).append('\n');
		}
		
		return sb2.toString();
	}
}
