package my.baekjoon.q55;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_5532 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int L = Integer.parseInt(br.readLine());
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int D = Integer.parseInt(br.readLine());
		
		int korDay = (int) Math.ceil((double) A / C);
		int matDay = (int) Math.ceil((double) B / D);
		int res = L - Math.max(korDay, matDay);
		
		System.out.println(res);
		
		br.close();
	}
	
}