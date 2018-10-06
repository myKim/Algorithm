package my.baekjoon.q111;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_11109 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		while(T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int d = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());
			
			int ser = n * s;
			int per = d + (n * p);
			
			if(per < ser) {
				bw.write("parallelize");
			}
			else if(per > ser) {
				bw.write("do not parallelize");
			}
			else {
				bw.write("does not matter");
			}
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
}
