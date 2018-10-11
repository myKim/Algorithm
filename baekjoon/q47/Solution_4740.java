package my.baekjoon.q47;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_4740 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String line = br.readLine();
			if(line.equals("***")) {
				break;
			}
			bw.write(new StringBuilder(line).reverse().toString());
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
}
