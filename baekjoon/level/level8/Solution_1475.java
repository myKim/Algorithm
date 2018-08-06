package my.level8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_1475 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int X = Integer.parseInt(br.readLine());
		
		bw.write(getFraction(X));
		
		br.close();
		bw.close();
	}
	
	public static String getFraction(int X) {
		int level = 1;  // 분수 단계
		int cnt = 1;    // 해당 단계까지 원소 개수
		
		while(cnt < X) {
			level++;
			cnt += level;
		}
		
		// 짝수 : 아래방향(↙)    / 홀수 : 윗방향(↗)
		int num1, num2; 
		num1 = 1;
		num2 = level;
		
		while(X != cnt) {
			num1++;
			num2--;
			cnt--;
		}
		
		StringBuilder sb = new StringBuilder();
		if(level % 2 == 0) {  // 짝수
			sb.append(num2).append("/").append(num1);
		}
		else {  // 홀수
			sb.append(num1).append("/").append(num2);
		}
		return sb.toString();
	}
}
