package my.baekjoon.q55;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_5596 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int S = 0;
		st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			S += Integer.parseInt(st.nextToken());
		}
		
		int T = 0;
		st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			T += Integer.parseInt(st.nextToken());
		}
		
		System.out.print(Math.max(S, T));
		
		br.close();
	}
	
}