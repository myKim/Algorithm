package my.baekjoon.q25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_2523 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		for(int i=1; i<2*N; i++) {
			int cnt = i;
			if(i > N) {
				cnt = 2*N-i;
			}
			for(int j=0; j<cnt; j++) {
				bw.write('*');
			}
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
}