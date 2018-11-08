package my.baekjoon.q10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1016_1 {
	
	private static final long MAX_VALUE = 1_000_001_000_000L;
	private static boolean[] soe;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long min = Long.parseLong(st.nextToken());
		long max = Long.parseLong(st.nextToken());
		
		sieveOfEratosthenes((int)Math.sqrt(MAX_VALUE));
		
		int size = (int) (max - min + 1);
		boolean[] arr = new boolean[size];
		Arrays.fill(arr, true);
		
		int leng = (int)Math.sqrt(max);
		for(int i=2; i<=leng; i++) {
			if(soe[i]) {
				long pow = (long)i*i;
				long tmp = (min%pow == 0) ? min/pow : min/pow+1;  
				long start = tmp*pow - min;
				
				for(long j=start; j<arr.length; j+=pow) {
					arr[(int)j] = false;
				}
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
	
	private static void sieveOfEratosthenes(int N) {
		soe = new boolean[N+1];
		Arrays.fill(soe, true);
		soe[0] = soe[1] = false;
		
		int size = (int) Math.sqrt(N);
		for(int prime=2; prime<=size; prime++) {
			for(int i=prime*prime; i<soe.length; i+=prime) {
				if(soe[i]) {
					soe[i] = false;
				}
			}
		}
	}

}
