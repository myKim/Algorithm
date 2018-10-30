package my.baekjoon.q45;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_4504 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int num = 0;
		while((num = Integer.parseInt(br.readLine())) != 0) {
			String not = (num % n == 0) ? "" : "NOT ";
			
			bw.write(num + " is " + not + "a multiple of " + n + ".");
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}

}
