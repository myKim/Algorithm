package my.baekjoon.q13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1357 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		String X = new StringBuilder(st.nextToken()).reverse().toString();
		String Y = new StringBuilder(st.nextToken()).reverse().toString();
		
		String res = String.valueOf(Integer.parseInt(X) + Integer.parseInt(Y));
		res = new StringBuilder(res).reverse().toString();
		res = String.valueOf(Integer.parseInt(res));
		
		System.out.println(res);
		
		br.close();
	}
	
}