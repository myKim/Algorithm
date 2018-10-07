package my.baekjoon.q49;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_4999 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String A = br.readLine();
		String B = br.readLine();
		String res = (A.length() >= B.length()) ? "go" : "no";
		bw.write(res);
		
		br.close();
		bw.close();
	}
	
}