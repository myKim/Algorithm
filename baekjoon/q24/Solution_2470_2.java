package my.baekjoon.q24;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_2470_2 {

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
		
		int min = Integer.MAX_VALUE;
		int start = 0;
		int end = arr.length - 1;
		int a = -1;
		int b = -1;
		
		while(start < end) {
			int sum = arr[start] + arr[end];
			if(min > Math.abs(sum)) {
				min = Math.abs(sum);
				a = start;
				b = end;
			}
			
			if(sum > 0) {
				end--;
			}
			else {
				start++;
			}
		}
		
		bw.write(arr[a] + " " + arr[b]);
		
		br.close();
		bw.close();
	}
}
