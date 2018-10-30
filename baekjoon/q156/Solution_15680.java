package my.baekjoon.q156;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_15680 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String N = br.readLine();
		System.out.println(N.equals("0") ? "YONSEI" : "Leading the Way to the Future");
		
		br.close();
	}
	
}