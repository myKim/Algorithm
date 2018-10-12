package my.baekjoon.q27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_2755 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		float sumPoint = 0;
		int sumCredit = 0;
		while(N-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			st.nextToken(); // °ú¸ñ¸í
			int credit = Integer.parseInt(st.nextToken());
			String grade = st.nextToken();
			
			sumCredit += credit;
			sumPoint += getPoint(grade) * credit;
		}
		
		System.out.printf("%.2f", sumPoint/sumCredit);
		
		br.close();
	}
	
	public static float getPoint(String grade) {
		float point = 0;
		
		switch(grade.charAt(0)) {
		case 'A':
			point += 4;
			break;
		case 'B':
			point += 3;
			break;
		case 'C':
			point += 2;
			break;
		case 'D':
			point += 1;
			break;
		default:
			return point;
		}
		
		switch(grade.charAt(1)) {
		case '+':
			point += 0.3;
			break;
		case '-':
			point -= 0.3;
			break;
		}
		
		return point;
	}

}
