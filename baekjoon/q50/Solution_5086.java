package my.baekjoon.q50;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_5086 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			if(A==0 && B==0) break;
			
			String res;
			if(A % B == 0) {
				res = "multiple"; 
			}
			else if(B % A == 0) {
				res = "factor";
			}
			else {
				res = "neither";
			}
			bw.write(res);
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
}
