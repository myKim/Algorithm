package my.baekjoon.q55;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_5554 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sec = 0;
		
		int N = 4;
		while(N-- > 0) {
			sec += Integer.parseInt(br.readLine());
		}		
		
		System.out.println(sec / 60);
		System.out.println(sec % 60);
		
		br.close();
	}
	
}