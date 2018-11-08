package my.baekjoon.q132;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_13277 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int num = Integer.parseInt(st.nextToken());
		int min = num;
		int max = num;
		
		while(st.hasMoreTokens()) {
			num = Integer.parseInt(st.nextToken());
			min = Math.min(min, num);
			max = Math.max(max, num);
		}
		
		System.out.print(max-min);
		
		br.close();
	}
	
}