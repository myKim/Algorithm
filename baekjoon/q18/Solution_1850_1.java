package my.baekjoon.q18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_1850_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		long G = gcd(A, B);
		
		// O(N)으로 '1'을 N번 출력
		for(long i=0; i<G; i++) {
			bw.write("1");
		}
		
		br.close();
		bw.close();
	}
	
	public static long gcd(long A, long B) {
		if(B == 0) {
			return A;
		}
		return gcd(B, A%B);
	}

}
