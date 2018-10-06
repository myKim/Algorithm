package my.baekjoon.q29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Solution_2935 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		BigInteger num1 = new BigInteger(br.readLine());
		String oper = br.readLine();
		BigInteger num2 = new BigInteger(br.readLine());
		
		if(oper.equals("*")) {
			System.out.println(num1.multiply(num2));
		}
		else if(oper.equals("+")) {
			System.out.println(num1.add(num2));
		}
		
		br.close();
	}
	
}