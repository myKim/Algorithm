package my.baekjoon.q20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_2089 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(N != 0) {
			int r = N % -2; // ������
			N /= -2; // ��
			
			while(r < 0) { // �������� ������ ���, r >= 0���� ���� ����
				N += 1; // �� +1 
				r += 2; // ������ +2
			}
			sb.append(r);
		}
		
		String res = (sb.length() > 0) ? sb.reverse().toString() : "0";
		
		System.out.println(res);
		
		br.close();
	}
}
