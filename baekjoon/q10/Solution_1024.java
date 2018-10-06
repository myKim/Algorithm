package my.baekjoon.q10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_1024 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		int result = -1;
		while(L <= 100) {
			// 偃熱陛 礎熱
			if(L%2 == 0) {
				if((N/L + N/L + 1) * L == N * 2) {
					result = N/L - L/2 + 1;
				}
			}
			// 偃熱陛 �汝�
			else {
				if(N%L == 0) {
					result = N/L - L/2;
				}
			}
			
			if(result < 0) {
				result = -1;
			}
			else {
				break;
			}
			L++;
		}
		
		if(result == -1) {
			bw.write(String.valueOf(result));
		}
		else {
			for(int i=0; i<L; i++) {
				bw.write(String.valueOf(result + i));
				if(i != L-1) {
					bw.write(" ");
				}
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
