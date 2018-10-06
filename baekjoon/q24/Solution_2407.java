package my.baekjoon.q24;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Solution_2407 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		long n = Integer.parseInt(st.nextToken());
		long m = Integer.parseInt(st.nextToken());
	
		m = Math.min(m, n-m);
		
		BigInteger res = new BigInteger("1");
		for(int i=0; i<m; i++) {
			res = res.multiply(new BigInteger(String.valueOf(n-i)));
		}
		for(int i=2; i<=m; i++) {
			res = res.divide(new BigInteger(String.valueOf(i)));
		}
		
		bw.write(String.valueOf(res));
		
		br.close();
		bw.close();
	}
	
	
}