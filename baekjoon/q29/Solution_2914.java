package my.baekjoon.q29;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_2914 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int I = Integer.parseInt(st.nextToken());
		
		// I-1 < X/A <= I
		// (I-1)*A < X <= I*A
		int X = (I-1)*A + 1;
		bw.write(String.valueOf(X));
		
		br.close();
		bw.close();
	}
	
}