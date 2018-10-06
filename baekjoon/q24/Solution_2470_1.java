package my.baekjoon.q24;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_2470_1 {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// Solution
		Arrays.sort(arr);
		int acid = -1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > 0) {
				acid = i;
				break;
			}
		}
		
		int a = -1, b = -1;
		int min = Integer.MAX_VALUE;
		
		if(acid < 0) { // 산성이 없을 경우
			a = arr.length-2;
			b = arr.length-1;
		}
		else if(acid == 0) { // 알칼리성이 없을 경우
			a = 0;
			b = 1;
		}
		else { // 산성, 알카리성 모두 존재
			if(acid > 1) {
				if(Math.abs(arr[acid-2] + arr[acid-1]) < min) {
					a = acid-2;
					b = acid-1;
					min = Math.abs(arr[acid-2] + arr[acid-1]);
				}
			}
			if(acid < arr.length-1) {
				if(Math.abs(arr[acid] + arr[acid+1]) < min) {
					a = acid;
					b = acid+1;
					min = Math.abs(arr[acid] + arr[acid+1]);
				}
			}
			
			for(int i=0; i<acid; i++) {
				for(int j=acid; j<arr.length; j++) {
					if(Math.abs(arr[i] + arr[j]) < min) {
						a = i;
						b = j;
						min = Math.abs(arr[i] + arr[j]);
					}
					
					if(arr[i] + arr[j] > 0) {
						break;
					}
				}
			}
		}
		
		bw.write(arr[a] + " " + arr[b]);
		
		br.close();
		bw.close();
	}
}
