package my.baekjoon.q14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1453 {
	
	private static final int MAX_CNT = 100;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[MAX_CNT+1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(N-- > 0) {
			arr[Integer.parseInt(st.nextToken())]++;
		}
		
		int cnt = 0;
		for(int i : arr) {
			if(i > 1) {
				cnt += i-1;
			}
		}
		
		System.out.println(cnt);
		
		br.close();
	}

}