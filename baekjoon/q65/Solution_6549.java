package my.baekjoon.q65;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_6549 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			
			if(n <= 0) {
				break;
			}
			
			int[] arr = new int[n];
			for(int i=0; i<n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			long max = 0;
			for(int i=0; i<arr.length; i++) {
				int height = arr[i];
				int width = 1;
				
				// ¿ÞÂÊ
				int tmp = i-1;
				while(tmp >= 0 && arr[tmp] >= height) {
					width++;
					tmp--;
				}
				
				// ¿À¸¥ÂÊ
				tmp = i+1;
				while(tmp < arr.length && arr[tmp] >= height) {
					width++;
					tmp++;
				}
				
				max = Math.max(max, (long)height * width);
			}
			bw.write(String.valueOf(max));
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
}
