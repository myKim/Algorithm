package my.baekjoon.q59;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_5988 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		while(N-- > 0) {
			String K = br.readLine();
			int tmp = K.charAt(K.length()-1) - '0';
			bw.write(((tmp & 1) == 0) ? "even" : "odd");
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}

}
