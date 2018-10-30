package my.baekjoon.q41;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Solution_4150 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		System.out.print(fibonacci(N));
		
		br.close();
	}
	
	public static BigInteger fibonacci(int N) {
		if(N <= 2) {
			return BigInteger.ONE;
		}
		
		BigInteger num1 = BigInteger.ONE;
		BigInteger num2 = BigInteger.ONE;
		BigInteger res = null;
		for(int i=3; i<=N; i++) {
			res = num1.add(num2);
			
			num1 = num2;
			num2 = res;
		}
		return res;
	}

}