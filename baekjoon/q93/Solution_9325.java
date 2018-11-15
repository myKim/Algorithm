package my.baekjoon.q93;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_9325 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int T = Integer.parseInt(br.readLine());
		while(T-- > 0) {
			int s = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			
			while(n--> 0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int q = Integer.parseInt(st.nextToken());
				int p = Integer.parseInt(st.nextToken());
				
				s += q*p;
			}
			
			bw.write(String.valueOf(s));
			bw.newLine();
		}
		
		bw.close();
		br.close();
	}
	
}
