package my.baekjoon.q53;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_5347 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		while(n-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long a = Long.parseLong(st.nextToken());
			long b = Long.parseLong(st.nextToken());
			
			bw.write(String.valueOf(lcm(a, b)));
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
	public static long gcd(long a, long b) {
		return (b == 0) ? a : gcd(b, a % b);
	}
	public static long lcm(long a, long b) {
		return (a * b) / gcd(a, b);
	}
}