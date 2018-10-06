package my.baekjoon.q24;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_2444 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		for(int i=1; i<2*N; i++) {
			int cnt1;
			int cnt2;
			
			if(i > N) {
				cnt1 = i-N;
				cnt2 = 2*(2*N-i)-1;
			}
			else {
				cnt1 = N-i;
				cnt2 = 2*i-1;
			}
			
			while(cnt1-- > 0) {
				bw.write(' ');
			}
			while(cnt2-- > 0) {
				bw.write('*');
			}
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
}