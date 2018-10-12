package my.baekjoon.q26;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_2609 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		bw.write(String.valueOf(gcd(A, B)));
		bw.newLine();
		bw.write(String.valueOf(lcm(A, B)));
		bw.newLine();
		
		br.close();
		bw.close();
	}
	
	public static int gcd(int A, int B) {
		if(B == 0) {
			return A;
		}
		return gcd(B, A%B);
	}
	
	public static int lcm(int A, int B) {
		return A*B/gcd(A, B);
	}

}
