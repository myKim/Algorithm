package my.baekjoon.q108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_10872 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int res = 1;
		for(int i=N; i>0; i--) {
			res *= i;
		}
		System.out.println(res);
		
		br.close();
	}

}