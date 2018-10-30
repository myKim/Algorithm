package my.baekjoon.q28;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_2845 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int L = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		int cnt = L * P;
		
		st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			int p = Integer.parseInt(st.nextToken());
			bw.write((p - cnt) + " ");
		}
		
		br.close();
		bw.close();
	}
}
