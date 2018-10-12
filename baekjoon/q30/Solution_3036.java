package my.baekjoon.q30;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_3036 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		
		while(st.hasMoreTokens()) {
			int B = Integer.parseInt(st.nextToken());
			int g = gcd(A, B);
			bw.write((A/g) + "/" + (B/g));
			bw.newLine();
		}
		
		bw.close();
		br.close();
	}
	
	public static int gcd(int A, int B) {
		return (B == 0) ? A : gcd(B, A%B);
	}
	
}