package my.baekjoon.q24;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_2475 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int res = 0;
		while(st.hasMoreTokens()) {
			int n = Integer.parseInt(st.nextToken());
			res += n*n; 
		}
		res %= 10;
		
		bw.write(String.valueOf(res));
		
		br.close();
		bw.close();
	}
}
