package my.baekjoon.q108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_10829 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long N = Long.parseLong(br.readLine());
		System.out.println(Long.toBinaryString(N));
		
		br.close();
	}
	
}
