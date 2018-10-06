package my.baekjoon.q25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Solution_2592 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = 10;
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int avg = 0;
		int mod = arr[0];
		int cnt = 0;
		int max = 0;
		
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++) {
			avg += arr[i];
			
			cnt++;
			if(i+1 >= arr.length || arr[i+1] != arr[i]) {
				if(cnt > max) {
					max = cnt;
					mod = arr[i];
				}
				cnt = 0;
			}
		}
		avg /= N;
		
		bw.write(String.valueOf(avg));
		bw.newLine();
		bw.write(String.valueOf(mod));
		bw.newLine();
		
		br.close();
		bw.close();
	}
}