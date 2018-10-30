package my.baekjoon.q28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_2864 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int min = getMinNum(A) + getMinNum(B);
		int max = getMaxNum(A) + getMaxNum(B);
		
		System.out.println(min + " " + max);
		
		br.close();
	}
	
	public static int getMinNum(int N) {
		return Integer.parseInt(String.valueOf(N).replace("6", "5"));
	}
	
	public static int getMaxNum(int N) {
		return Integer.parseInt(String.valueOf(N).replace("5", "6"));
	}
}