package my.baekjoon.q53;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_5355 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		while(T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			float N = Float.parseFloat(st.nextToken());
			
			while(st.hasMoreTokens()) {
				String op = st.nextToken();
				
				switch(op) {
				case "@":
					N *= 3;
					break;
				case "%":
					N += 5;
					break;
				case "#":
					N -= 7;
					break;
				}
			}
			
			bw.write(String.format("%.2f", N));
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
}