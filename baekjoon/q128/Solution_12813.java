package my.baekjoon.q128;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_12813 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char[] a = br.readLine().toCharArray();
		char[] b = br.readLine().toCharArray();
		char[][] r = new char[5][a.length];
		
		for(int i=0; i<a.length; i++) {
			int num1 = a[i]-'0';
			int num2 = b[i]-'0';
			
			r[0][i] = (char) ((num1 & num2) + '0');  // A & B
			r[1][i] = (char) ((num1 | num2) + '0');  // A | B
			r[2][i] = (char) ((num1 ^ num2) + '0');  // A ^ B
			r[3][i] = (char) ((num1 ^ 1) + '0');  // ~A (A ^ 1)
			r[4][i] = (char) ((num2 ^ 1) + '0');  // ~B (B ^ 1)
		}
		
		for(char[] arr : r) {
			bw.write(arr);
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
}
