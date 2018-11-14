package my.baekjoon.q25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_2506 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int bonus = 0;
		int res = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(N-- > 0) {
			int n = Integer.parseInt(st.nextToken());
			
			if(n == 1) {
				res += (1 + bonus++);
			}
			else {
				bonus = 0;
			}
		}
		
		System.out.print(res);

		br.close();
	}
	
}
