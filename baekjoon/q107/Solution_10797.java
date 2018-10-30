package my.baekjoon.q107;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_10797 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int cnt = 0;
		while(st.hasMoreTokens()) {
			int car = Integer.parseInt(st.nextToken());
			if(car == N) cnt++; 
		}
		System.out.println(cnt);
		
		br.close();
	}
	
}
