package my.baekjoon.q29;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_2903 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		
		int n = 1;  // 최초 변의 사각형 개수
		while(N-- > 0) {
			n *= 2;
		}
		bw.write(String.valueOf((int) Math.pow(n+1, 2)));
		
		br.close();
		bw.close();
	}
	
}