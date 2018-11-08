package my.baekjoon.q96;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_9656 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		// Ȧ���� CY / ¦���� SK
		String winner = ((N & 1) != 0) ? "CY" : "SK";
		
		System.out.print(winner);
		
		br.close();
	}
	
}
