package my.baekjoon.q19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1978_3 {
	
	public static void main(String[] args) throws IOException {
		/*****************************************
		 * 1. Input
		 *****************************************/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[] array = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<N; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		/*****************************************
		 * 2. Solution
		 *****************************************/
		int max = array[0];
		for(int n : array) {
			if(max < n) {
				max = n;
			}
		}
		
		boolean[] flags = new boolean[max+1];
		Arrays.fill(flags, true);
		flags[0] = false;
		flags[1] = false;
		
		int prime = 2;
		int size = (int) Math.sqrt(max);
		while(prime <= size) {		
			if(flags[prime]) {
				for(int j=prime*prime; j<=max; j+=prime) {
					flags[j] =false;
				}
			}
			prime++;
		}
		
		int cnt = 0;
		for(int n : array) {
			if(flags[n]) {
				cnt++;
			}
		}
		
		/*****************************************
		 * 3. Output
		 *****************************************/
		bw.write(String.valueOf(cnt));
		
		br.close();
		bw.close();
	}
}
