package my.baekjoon.q109;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_10984 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		while(T-- > 0) {
			int A = 0;
			float B = 0;
			int tmp;
			
			int N = Integer.parseInt(br.readLine());
			while(N-- > 0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				tmp = Integer.parseInt(st.nextToken());
				A += tmp;
				B += Float.parseFloat(st.nextToken()) * tmp;
			}
			bw.write(String.format("%d %.1f", A, B/A));
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
}
