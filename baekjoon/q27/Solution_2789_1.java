package my.baekjoon.q27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_2789_1 {

	public static final String[] bl = {"C","A","M","B","R","I","D","G","E"};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		for(String b : bl) {
			str = str.replace(b, "");
		}
		System.out.println(str);
		
		br.close();
	}

}
