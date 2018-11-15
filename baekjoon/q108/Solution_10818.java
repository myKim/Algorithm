package my.baekjoon.q108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_10818 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		while(N-- > 0) {
			int num = Integer.parseInt(st.nextToken());
			
			min = Math.min(min, num);
			max = Math.max(max, num);
		}
		
		System.out.print(min + " " + max);
		
		br.close();
	}

}
