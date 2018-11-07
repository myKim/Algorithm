package my.baekjoon.q55;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_5585 {

	// 잔돈이 배수 관계일 경우 그리디 알고리즘 성립
	private static final int[] coin = {500, 100, 50, 10, 5, 1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = 1000 - Integer.parseInt(br.readLine());
		
		int cnt = 0;
		for(int c : coin) {
			cnt += N / c;
			N %= c;
		}
		
		System.out.println(cnt);
		
		br.close();
	}
	
}
