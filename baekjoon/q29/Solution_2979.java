package my.baekjoon.q29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_2979 {

	private static final int MAX_TIME = 100; 
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		int N = 3;
		int[] parking = new int[MAX_TIME+1];
		Arrays.fill(parking, 0);
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			
			for(int j=s; j<e; j++) {
				parking[j]++;
			}
		}
		
		int cost = 0;
		for(int i=0; i<parking.length; i++) {
			if(parking[i] == 1) {
				cost += (A*1);
			}
			else if(parking[i] == 2) {
				cost += (B*2);
			}
			else if(parking[i] == 3) {
				cost += (C*3);
			}
		}
		
		System.out.println(cost);
		
		br.close();
	}
	
}