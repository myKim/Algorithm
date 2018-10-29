package my.baekjoon.q47;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_4766 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String line = null;
		float before = Float.MIN_VALUE;
		while(!(line = br.readLine()).equals("999")) {
			float N = Float.parseFloat(line);
			
			if(before != Float.MIN_VALUE) {
				bw.write(String.format("%.2f", N-before));
				bw.newLine();
			}
			before = N;
		}
		
		br.close();
		bw.close();
	}

}
