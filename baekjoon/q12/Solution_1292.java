package my.baekjoon.q1292;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1292 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[1000+1];
		int num = 1;
		for(int i=1; i<arr.length; ) {
			int cnt = num;
			while(cnt-- > 0 && i<arr.length) {
				arr[i++] = num;
			}
			num++;
		}
		
		int sum = 0;
		for(int i=A; i<=B; i++) {
			sum += arr[i];
		}
		
		System.out.print(sum);
		
		br.close();
	}
}
