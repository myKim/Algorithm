package my.baekjoon.q29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_2921 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		for(int i=0; i<=N; i++) {
			for(int j=i; j<=N; j++) { 
				cnt += (i+j);
			}
		}
		System.out.println(cnt);
		
		br.close();
	}
	
}