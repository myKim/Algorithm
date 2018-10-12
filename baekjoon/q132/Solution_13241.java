package my.baekjoon.q132;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_13241 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		
		long g = gcd(A, B);
		bw.write(String.valueOf(A*B/g));
		
		br.close();
		bw.close();
	}
	
	public static long gcd(long A, long B) {
		while(B != 0) {
			long r = A%B;
			A = B;
			B = r;
		}
		return A;
	}
	
}