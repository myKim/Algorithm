package my.baekjoon.q12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1246 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] P = new int[M];
		
		for(int i=0; i<M; i++) {
			P[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(P);
		
		int price = P[0];
		int revenue = P[0] * ((M > N) ? N : M);
		
		for(int i=1; i<P.length; i++) {
			int r = P[i] * ((M-i > N) ? N : (M-i));
			if(revenue < r) {
				price = P[i];
				revenue = r;
			}
		}
		
		System.out.print(price + " " + revenue);
		
		br.close();
	}
	
}
