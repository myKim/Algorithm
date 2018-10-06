package my.baekjoon.q110;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_11003_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		
		for(int i=0; i<arr.length; i++) {
			int min = arr[i];
			for(int j=1; j<L; j++) {
				min = (i-j >= 0) ? Math.min(min, arr[i-j]) : min;
			}
			
			bw.write(String.valueOf(min));
			if(i < arr.length-1) {
				bw.write(" ");
			}
		}
		
		br.close();
		bw.close();
	}

}
