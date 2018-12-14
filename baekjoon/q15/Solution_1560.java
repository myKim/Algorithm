package my.baekjoon.q15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Solution_1560 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BigInteger N = new BigInteger(br.readLine());
		BigInteger result;
		
		if(N.compareTo(BigInteger.ONE) > 0) {
			result = N.add(N).subtract(new BigInteger("2"));
		}
		else {
			result = N;
		}
		
		System.out.print(result);
		
		br.close();
	}
	
}
