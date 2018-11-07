package my.baekjoon.q28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_2869_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		int day = 0;
		int cur = 0;
		
		day = (V-A) / (A-B);
		cur = day * (A-B);
		if(cur + A >= V) {
			day += 1;
		}
		else {
			day += 2;
		}
	
		System.out.print(day);
		
		br.close();
	}
	
}
