package my.baekjoon.q24;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_2455 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int max = 0;
		int cnt = 0;
		
		for(int i=0; i<4; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			cnt = cnt - Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
			
			if(cnt > max) {
				max = cnt;
			}
		}
		
		bw.write(String.valueOf(max));
		
		bw.flush();
		bw.close();
		br.close();
	}
	
}
