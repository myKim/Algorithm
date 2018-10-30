package my.baekjoon.q144;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_14405_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		str = str.replace("pi", " ");
		str = str.replace("ka", " ");
		str = str.replace("chu", " ");
		str = str.replace(" ", "");
		
		System.out.print(str.length() == 0 ? "YES" : "NO");
		
		br.close();
		bw.close();
	}
	
}