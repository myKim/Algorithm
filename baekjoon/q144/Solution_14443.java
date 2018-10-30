package my.baekjoon.q144;

import java.io.IOException;
import java.math.BigInteger;

public class Solution_14443 {

	public static void main(String[] args) throws IOException {
		// 채점번호가 소수일때 정답, 아무거나 출력해도 무관
		BigInteger bi = new BigInteger("10655402");
		System.out.println(bi.nextProbablePrime());
	}
	
}