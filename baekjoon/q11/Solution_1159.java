package my.baekjoon.q11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1159 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] alp = new int[26];
		
		while(N-- > 0) {
			char c = br.readLine().charAt(0);
			alp[c-'a']++;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<alp.length; i++) {
			if(alp[i] >= 5) {
				sb.append((char)(i+'a'));
			}
		}
		
		if(sb.length() == 0) {
			sb.append("PREDAJA");
		}
		System.out.println(sb);
		
		br.close();
	}
}
