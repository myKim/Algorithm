package my.baekjoon.q23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_2355 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		
		long ans = (A+B)*(Math.abs(B-A)+1)/2; // 조건에 A, B 대소관계가 명시되지 않은 것 주의
		
		System.out.print(ans);
		
		br.close();
	}

}
