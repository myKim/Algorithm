package my.baekjoon.q102;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_10250 {

	public static void main(String[] args) throws IOException {
		
		// 1. Input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		int[] H = new int[T];
		int[] W = new int[T];
		int[] N = new int[T];
		
		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			H[i] = Integer.parseInt(st.nextToken());
			W[i] = Integer.parseInt(st.nextToken());
			N[i] = Integer.parseInt(st.nextToken());
		}
		
		// 2. Solution
		for(int i=0; i<T; i++) {
			int h, w;
			h = (N[i]-1) % H[i] + 1; // Ãþ
			w = (N[i]-1) / H[i] + 1; // È£¼ö
			
			bw.write(String.valueOf(h * 100 + w));
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
}
