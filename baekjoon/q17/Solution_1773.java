package my.baekjoon.q17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1773 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		boolean[] time = new boolean[C+1];
		
		int cnt = 0;
		while(N-- > 0) {
			int p = Integer.parseInt(br.readLine());
			for(int i=p; i<=C; i+=p) {
				time[i] = true;
			}
		}
		
		for(int i=1; i<=C; i++) {
			if(time[i]) {
				cnt++;
			}
		}
		
		bw.write(String.valueOf(cnt));
		
		br.close();
		bw.close();
	}
	
}