package my.baekjoon.q29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_2965_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		br.close();
		
		int cnt = 0;
		while(A < B && B < C) {
			if(B - A > C - B) {
				C = B;
				B = B-1;
				
				if(A < B) {
					cnt++;
				}
			}
			else {
				A = B;
				B = B+1;
				
				if(B < C) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
	}
	
}
