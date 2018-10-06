package my.baekjoon.q19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1978_2 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[] array = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<N; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = array[0];
		for(int n : array) {
			if(max < n) {
				max = n;
			}
		}
		
		boolean[] flags = new boolean[max+1];
		Arrays.fill(flags, true);
		flags[1] = false;
		
		int j = 2;
		int size = (int) Math.sqrt(max);
		while(j <= size) {		
			int i = j + j;
			while(i <= max) {
				flags[i] = false;
				i += j;
			}
			j++;
			while(j <= size && !flags[j]) {
				j++;
			}
		}
		
		int cnt = 0;
		for(int n : array) {
			if(flags[n]) {
				cnt++;
			}
		}
		
		bw.write(String.valueOf(cnt));
		
		br.close();
		bw.close();
	}
}
