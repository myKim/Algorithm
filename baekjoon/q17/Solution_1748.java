package my.baekjoon.q17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_1748 {

	public static int[] parent;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int  N = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		int len = 1;
		int num = 10;
		
		while(true) {
			if(N >= num) {
				cnt += len * 9 * (int)Math.pow(10, len-1);
				len += 1;
				num *= 10;
			}
			else {
				cnt += (N-(num/10)+1) * len;
				break;
			}
		}
		
		bw.write(String.valueOf(cnt));
		
		br.close();
		bw.close();
	}
	
}