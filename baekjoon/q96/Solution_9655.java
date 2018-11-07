package my.baekjoon.q96;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_9655 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		// Ȧ���� SK / ¦���� CY
		String winner = ((N & 1) != 0) ? "SK" : "CY";
		
		System.out.print(winner);
		
		br.close();
	}
	
}
