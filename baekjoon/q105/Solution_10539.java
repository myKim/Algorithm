package my.baekjoon.q105;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_10539 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] B = new int[N];
		
		for(int i=0; i<B.length; i++) {
			B[i] = Integer.parseInt(st.nextToken());
		}
		
		bw.write(B[0] + " ");
		for(int i=1; i<B.length; i++) {
			int n = B[i]*(i+1) - B[i-1]*i;
			bw.write(n + " ");
		}
		
		br.close();
		bw.close();
	}

}