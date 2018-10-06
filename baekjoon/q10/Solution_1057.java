package my.baekjoon.q10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_1057 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int j = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		
		int round = 0;
		while(N > 1) {
			round++;
			
			if(isMatch(j, h)) {
				break;
			}
			
			j = (j+1)/2;
			h = (h+1)/2;
			N = (N+1)/2;
		}
		
		if(N <= 1) {
			bw.write("-1");
		}
		else {
			bw.write(String.valueOf(round));
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static boolean isMatch(int a, int b) {
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		
		return (min+1 == max) && (min%2 == 1);
	}
	
}
