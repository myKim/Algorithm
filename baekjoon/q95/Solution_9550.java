package my.baekjoon.q95;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_9550 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		while(T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			
			int res = 0;
			st = new StringTokenizer(br.readLine());
			while(N-- > 0) {
				int cnt = Integer.parseInt(st.nextToken());
				res += cnt / K;
			}
			
			bw.write(String.valueOf(res));
			bw.newLine();
		}
		
		bw.close();
		br.close();
	}
	
}
