package my.baekjoon.q19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1977 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		int min = Integer.MAX_VALUE;
		int sum = 0;
		
		int i = (int) Math.sqrt(M);  // 시작값 취득
		int tmp;
		while((tmp = i*i) <= N) {
			if(M <= tmp && tmp <= N) {
				min = Math.min(min, tmp);
				sum += tmp;
			}
			i++;
		}
		
		if(sum != 0) {
			System.out.println(sum);
			System.out.println(min);
		}
		else {
			System.out.println(-1);
		}
		br.close();
	}
}