package my.baekjoon.q66;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Solution_6679_1 {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=1000; i<10000; i++) {
			if(isSinggi(i)) {
				bw.write(String.valueOf(i));
				bw.newLine();
			}
		}
		
		bw.close();
	}
	
	public static boolean isSinggi(int N) {
		int sum1, sum2;
		
		String str = Integer.toString(N, 10);
		sum1 = 0;
		for(int i=0; i<str.length(); i++) {
			sum1 += str.charAt(i)-'0';
		}
		
		str = Integer.toString(N, 12);
		sum2 = 0;
		for(int i=0; i<str.length(); i++) {
			sum2 += Integer.valueOf(String.valueOf(str.charAt(i)), 12);
		}
		if(sum1 != sum2) return false; 
		
		str = Integer.toString(N, 16);
		sum2 = 0;
		for(int i=0; i<str.length(); i++) {
			sum2 += Integer.valueOf(String.valueOf(str.charAt(i)), 16);
		}
		if(sum1 != sum2) return false;
		
		return true;
	}
	
}
