package my.baekjoon.q27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_2744 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] arr = br.readLine().toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for(char c : arr) {
			if('a'<=c && c<='z') {
				sb.append((char)(c + ('A'-'a')));
			}
			else {
				sb.append((char)(c + ('a'-'A')));
			}
		}
		System.out.print(sb.toString());
		
		br.close();
	}

}
