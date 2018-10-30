package my.baekjoon.q118;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_11816 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int radix = 10;
		
		if(str.matches("^0x.+")) {
			str = str.substring(2);
			radix = 16;
		}
		if(str.matches("^0.+")) {
			str = str.substring(1);
			radix = 8;
		}
		
		System.out.println(Integer.parseInt(str, radix));
		
		br.close();
	}

}