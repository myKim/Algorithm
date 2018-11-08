package my.baekjoon.q96;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_9659 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long N = Long.parseLong(br.readLine());
		
		// È¦¼ö¸é SK / Â¦¼ö¸é CY
		String winner = ((N & 1) != 0) ? "SK" : "CY";
		
		System.out.print(winner);
		
		br.close();
	}
	
}
