package my.baekjoon.q55;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_5522 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int sum = 0;
		int N = 5;
		while(N-- > 0) {
			sum += Integer.parseInt(br.readLine());
		}
		System.out.print(sum);
		
		br.close();
	}
	
}