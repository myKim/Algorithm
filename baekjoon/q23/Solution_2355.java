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
		
		long ans = (A+B)*(Math.abs(B-A)+1)/2; // ���ǿ� A, B ��Ұ��谡 ��õ��� ���� �� ����
		
		System.out.print(ans);
		
		br.close();
	}

}
