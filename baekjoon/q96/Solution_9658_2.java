package my.baekjoon.q96;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_9658_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		N = N % 7;
		String winner = (N==1||N==3) ? "CY" : "SK";
		
		System.out.print(winner);
		
		br.close();
	}
	
}
