package my.baekjoon.q63;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Solution_6359 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		while(T-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int[] jail = new int[n+1];
			Arrays.fill(jail, 0);
			
			for(int i=1; i<=n; i++) {
				for(int j=i; j<=n; j+=i) {
					jail[j] ^= 1;
				}
			}
			
			int cnt = 0;
			for(int i : jail) {
				cnt += i;
			}
			
			bw.write(String.valueOf(cnt));
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
}
