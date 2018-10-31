package my.baekjoon.q56;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Solution_5618 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int g = Integer.parseInt(st.nextToken());
		while(st.hasMoreTokens()) { // ��ü �ִ����� ���ϱ�
			g = gcd(g, Integer.parseInt(st.nextToken()));
		}
		
		int size = (int)Math.sqrt(g);
		ArrayList<Integer> res = new ArrayList<>();
		for(int i=1; i<=size; i++) { // �ִ������� ��� ã��
			if((g % i) == 0) {
				res.add(i);
				if((g / i) != i) {
					res.add(g / i);
				}
			}
		}
		Collections.sort(res);
		
		for(int i : res) {
			System.out.println(i);
		}
		
		br.close();
	}
	
	public static int gcd(int a, int b) {
		return (b==0) ? a : gcd(b, a%b);
	}
	
}