package my.baekjoon.q96;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_9660 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long N = Long.parseLong(br.readLine());
		
		N = N % 7;
		String winner = (N==2||N==0) ? "CY" : "SK";
		
		System.out.print(winner);
		
		br.close();
	}
	
}
