package my.baekjoon.q12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1259 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = null;
		while(!(str = br.readLine()).equals("0")) {
			System.out.println(isPal(str) ? "yes" : "no");
		}
		
		br.close();
	}
	
	public static boolean isPal(String str) {
		for(int i=0; i<str.length()/2; i++) {
			if(str.charAt(i) != str.charAt(str.length()-1-i)) {
				return false;
			}
		}
		return true;
	}
	
}