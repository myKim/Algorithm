package my.baekjoon.q110;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Solution_11047 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		Integer[] value = new Integer[N];
		
		for(int i=0; i<value.length; i++) {
			value[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(value, Collections.reverseOrder());
		
		int cnt = 0;
		for(int i=0; i<value.length; i++) {
			cnt += (K / value[i]);
			K %= value[i];
		}
		
		bw.write(String.valueOf(cnt));
		
		br.close();
		bw.close();
	}
	
}
