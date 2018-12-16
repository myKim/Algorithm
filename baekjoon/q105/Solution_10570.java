package my.baekjoon.q105;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_10570 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		while(N-- > 0) {
			int[] cnt = new int[1001];
			
			int V = Integer.parseInt(br.readLine());
			while(V-- > 0) {
				int S = Integer.parseInt(br.readLine());
				cnt[S]++;
			}
			
			int maxNumber = 0;
			for(int i=0; i<cnt.length; i++) {
				maxNumber = (cnt[maxNumber] < cnt[i]) ? i : maxNumber;
			}
			
			bw.write(String.valueOf(maxNumber));
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}

}