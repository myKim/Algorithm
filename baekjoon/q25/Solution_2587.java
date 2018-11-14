package my.baekjoon.q25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_2587 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = 5;
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		
		int mid = arr[arr.length/2];
		int avg = 0;
		for(int i : arr) {
			avg += i;
		}
		avg /= arr.length;
		
		System.out.println(avg);
		System.out.println(mid);
				
		br.close();
	}
}
