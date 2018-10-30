package my.baekjoon.q30;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_3046 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int R1 = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		
		bw.write(String.valueOf(S*2-R1));
		
		bw.close();
		br.close();
	}
	
}