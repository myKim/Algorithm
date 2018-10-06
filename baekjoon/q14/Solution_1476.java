package my.baekjoon.q14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_1476 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int E = Integer.parseInt(st.nextToken()) - 1;
		int S = Integer.parseInt(st.nextToken()) - 1;
		int M = Integer.parseInt(st.nextToken()) - 1;
		
		int year = 0;
		while(((year%15) != E) || ((year%28) != S) || ((year%19) != M)) {
			year++;
		}
		
		bw.write(String.valueOf(year+1));
		
		br.close();
		bw.close();
	}
}