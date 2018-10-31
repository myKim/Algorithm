package my.baekjoon.q92;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_9243 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String A = br.readLine();
		String B = br.readLine();
		
		if((N & 1) != 0) { // È¦¼öÀÏ °æ¿ì
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<A.length(); i++) {
				sb.append(A.charAt(i)=='0' ? "1" : "0");
			}
			A = sb.toString();
		}
		
		System.out.println(A.equals(B) ? "Deletion succeeded" : "Deletion failed");
		
		br.close();
	}
	
}
