package my.baekjoon.q108;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_10804 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		int N = 10;
		while(N-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			
			arr = reverse(arr, s-1, e);
		}
		
		for(int a : arr) {
			bw.write(a + " ");
		}
		
		br.close();
		bw.close();
	}
	
	public static int[] reverse(int[] arr, int startIdx, int endIdx) { 
		int[] res = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			if(startIdx <= i && i < endIdx) {
				res[i] = arr[startIdx+endIdx-i-1];
			}
			else {
				res[i] = arr[i];
			}
		}
		return res;
	}
	
}
