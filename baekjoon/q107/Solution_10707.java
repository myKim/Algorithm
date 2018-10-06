package my.baekjoon.q107;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_10707 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int D = Integer.parseInt(br.readLine());
		int P = Integer.parseInt(br.readLine());
		
		bw.write(String.valueOf(solution(A, B, C, D, P)));
		
		br.close();
		bw.close();
	}
	
	public static int solution(int A, int B, int C, int D, int P) {
		int costX = A*P;
		int costY = (P > C) ? B + (P-C)*D : B;
		
		return Math.min(costX, costY);
	}
	
}
