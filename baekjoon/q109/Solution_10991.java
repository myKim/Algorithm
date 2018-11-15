package my.baekjoon.q109;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_10991 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		System.out.print(star(N));
		
		br.close();
	}
	
	public static String star(int N) {
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N-i; j++) {
				sb.append(' ');
			}
			for(int j=1; j<=2*i-1; j++) {
				if((j&1) == 1) { // È¦¼ö
					sb.append('*');
				}
				else { // Â¦¼ö
					sb.append(' ');
				}
			}
			sb.append('\n');
		}
		
		return sb.toString();
	}
}
