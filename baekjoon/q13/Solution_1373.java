package my.baekjoon.q13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1373 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String bin = br.readLine();
		System.out.print(convert(bin));
		
		br.close();
	}
	
	public static String convert(String bin) {
		StringBuilder sb = new StringBuilder(bin);
		while(sb.length() % 3 != 0) {
			sb.insert(0, "0");
		}
		bin = sb.toString();
		
		sb = new StringBuilder();
		for(int i=0; i<bin.length(); i+=3) {
			String tmp = bin.substring(i, i+3);
			tmp = Integer.toOctalString(Integer.valueOf(tmp, 2));
			
			sb.append(tmp);
		}
		
		return sb.toString();
	}
	
}