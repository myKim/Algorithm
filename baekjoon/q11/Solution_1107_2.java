package my.baekjoon.q11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1107_2 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 1. Input
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		StringTokenizer st = null;
		
		boolean[] btn = new boolean[10];
		Arrays.fill(btn, true);
		
		if(M > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			
			for(int i=0; i<M; i++) {
				btn[Integer.parseInt(st.nextToken())] = false;
			}
		}
		
		// 2. Solution
		int c = 100;
		int minCnt = Math.abs(N - c);
		
		if(M == 0) {
			minCnt = Math.min(minCnt, String.valueOf(N).length());
		}
		else {
			int size = N < 100 ? 100 : 2 * N;
			
			for(int i=0; i<=size; i++) {
				if(isEnableChannel(btn, i)) {
					int tmp = Math.abs(N - i) + String.valueOf(i).length();
					minCnt = Math.min(minCnt, tmp);
				}
			}
		}
		
		bw.write(String.valueOf(minCnt));
			
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static boolean isEnableChannel(boolean[] btn, int ch) {
		boolean result = true;
		
		if(ch == 0) {
			if(btn[0]) {
				return true;
			}
			else {
				return false;
			}
		}
		
		while(ch > 0) {
			if(!btn[ch%10]) {
				result = false;
				break;
			}
			ch /= 10;
		}
		return result;
	}
	
}
