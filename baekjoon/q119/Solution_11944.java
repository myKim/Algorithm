package my.baekjoon.q119;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_11944 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		String str = String.valueOf(N);
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			if(sb.length() >= M) {
				break;
			}
			sb.append(str);
		}
		
		String res;
		if(sb.length() > M) {
			res = sb.substring(0, M);
		}
		else {
			res = sb.toString();
		}
		
		bw.write(res);
		
		br.close();
		bw.close();
	}
	
}
