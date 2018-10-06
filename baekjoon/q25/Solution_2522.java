package my.baekjoon.q25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_2522 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		for(int i=0; i<2*N-1; i++) {
			if(i < N) {
				for(int j=0; j<N-1-i; j++) {
					bw.write(' ');
				}
				for(int j=0; j<i+1; j++) {
					bw.write('*');
				}
			}
			else {
				for(int j=0; j<i-N+1; j++) {
					bw.write(' ');
				}
				for(int j=0; j<2*N-1-i; j++) {
					bw.write('*');
				}
			}
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
}