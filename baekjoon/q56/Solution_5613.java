package my.baekjoon.q56;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_5613 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int res = Integer.parseInt(br.readLine());
		
		String str = null;
		while(!(str = br.readLine()).equals("=")) {
			switch(str) {
			case "+":
				res += Integer.parseInt(br.readLine());
				break;
			case "-":
				res -= Integer.parseInt(br.readLine());
				break;
			case "*":
				res *= Integer.parseInt(br.readLine());
				break;
			case "/":
				res /= Integer.parseInt(br.readLine());
				break;
			}
		}
		
		System.out.print(res);
		
		br.close();
	}
	
}