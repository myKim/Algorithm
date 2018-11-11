package my.baekjoon.q10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1032 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		char[][] strArr = new char[N][];
		for(int i=0; i<N; i++) {
			strArr[i] = br.readLine().toCharArray();
		}
		
		StringBuilder sb = new StringBuilder();
		
		int length = strArr[0].length;
		for(int j=0; j<length; j++) {
			char c = strArr[0][j];
			
			for(int i=1; i<N; i++) {
				if(strArr[i][j] != c) {
					c = '?';
					break;
				}
			}
			sb.append(c);
		}
		
		System.out.print(sb);
		
		br.close();
	}

}
