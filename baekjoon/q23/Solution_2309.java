package my.baekjoon.q23;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Solution_2309 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] h = new int[9];
		int sum = 0;
		for(int i=0; i<h.length; i++) {
			h[i] = Integer.parseInt(br.readLine());
			sum += h[i];
		}
		Arrays.sort(h);
		
		int a = -1; 
		int b = -1;
		for(int i=0; i<h.length-1; i++) {
			for(int j=i+1; j<h.length; j++) {
				if(sum - h[i] - h[j] == 100) {
					a = i;
					b = j;
					break;
				}
			}
			if(a > -1 && b > -1) {
				break;
			}
		}
		
		for(int i=0; i<h.length; i++) {
			if(i != a && i != b) {
				bw.write(String.valueOf(h[i]));
				bw.newLine();
			}
		}
		
		br.close();
		bw.close();
	}
	
}
