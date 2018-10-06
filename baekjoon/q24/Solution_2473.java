package my.baekjoon.q24;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_2473 {

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
		
		long min = Long.MAX_VALUE;
		int start, mid, end;
		int a = -1;
		int b = -1;
		int c = -1;
		
		for(start=0; start<N-2; start++) {
			mid = start + 1;
			end = N - 1;
			
			while(mid < end) {
				long sum = (long) arr[start] + arr[mid] + arr[end];
				
				if(min > Math.abs(sum)) {
					min = Math.abs(sum);
					a = start;
					b = mid;
					c = end;
				}
				
				if(sum > 0) {
					end--;
				}
				else {
					mid++;
				}
			}
		}
		
		bw.write(arr[a] + " " + arr[b] + " " + arr[c]);
		
		br.close();
		bw.close();
	}
}
