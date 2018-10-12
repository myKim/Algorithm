package my.baekjoon.q19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_1934 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		while(T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			int g = gcd(A, B);
			bw.write(String.valueOf(A*B/g));
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
	public static int gcd(int A, int B) {
		if(B == 0) {
			return A;
		}
		return gcd(B, A%B);
	}
	
}