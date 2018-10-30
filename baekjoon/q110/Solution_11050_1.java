package my.baekjoon.q110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_11050_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		K = Math.min(K, N-K);
		
		int a = 1, b = 1;
		for(int i=0; i<K; i++) {
			a *= (N-i);
			b *= (i+1);
		}
		System.out.println(a/b);
		
		br.close();
	}

}