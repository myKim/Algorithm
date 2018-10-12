package my.baekjoon.q144;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_14490_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), ":");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int min = Math.min(A, B);
		
		for(int i=min; i>=1; i--) {
			if(A%i==0 && B%i==0) {
				A /= i;
				B /= i;
			}
		}
		
		bw.write(A + ":" + B);
		
		br.close();
		bw.close();
	}
}