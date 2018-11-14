package my.baekjoon.q29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_2953 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = 5;
		int max = 0;
		int idx = -1;
		
		for(int i=1; i<=N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int sum = 0;
			while(st.hasMoreTokens()) {
				sum += Integer.parseInt(st.nextToken());
			}
			
			if(max < sum) {
				idx = i;
				max = Math.max(max, sum);
			}
		}
		
		System.out.print(idx + " " + max);
		
		br.close();
	}
}
