package my.baekjoon.q101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_10162 {

	private static final int[] button = {5*60, 1*60, 10};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		int A = T / button[0];
		T %= button[0];
		
		int B = T / button[1];
		T %= button[1];
		
		int C = T / button[2];
		T %= button[2];
		
		if(T == 0) {
			System.out.print(A + " " + B + " " + C);
		}
		else {
			System.out.print(-1);
		}
		
		br.close();
	}
	
}
