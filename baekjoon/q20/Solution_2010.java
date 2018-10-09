package my.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_2010 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int cnt = 1;
		while(N-- > 0) {
			int m = Integer.parseInt(br.readLine());
			cnt += (m-1);
		}
		bw.write(String.valueOf(cnt));
		
		br.close();
		bw.close();
	}
}
