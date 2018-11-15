package my.baekjoon.q30;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_3058 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		while(T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int sum = 0;
			int min = 101;
			while(st.hasMoreTokens()) {
				int n = Integer.parseInt(st.nextToken());
				if((n&1) == 0) { // 최종비트 '&'연산으로 짝수 확인
					sum += n;
					min = Math.min(min, n);
				}
			}
			
			bw.write(sum + " " + min);
			bw.newLine();
		}
		
		bw.close();
		br.close();
	}
	
}
