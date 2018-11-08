package my.baekjoon.q10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1016_2 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		long min = Long.parseLong(st.nextToken());
		long max = Long.parseLong(st.nextToken());
		
		int size = (int) (max - min + 1);
		boolean[] arr = new boolean[size];
		Arrays.fill(arr, true);
		
		int leng = (int)Math.sqrt(max);
		for(int i=2; i<=leng; i++) {
			long pow = (long)i*i;
			long tmp = (min%pow == 0) ? min/pow : min/pow+1;  
			long start = tmp*pow - min;
			
			for(long j=start; j<arr.length; j+=pow) {
				arr[(int)j] = false;
			}
		}
		
		int cnt = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]) {
				cnt++;
			}
		}
		
		System.out.print(cnt);
		
		br.close();
	}

}
