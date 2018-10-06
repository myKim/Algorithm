package my.baekjoon.q75;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_7568 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		int N = Integer.parseInt(br.readLine());
		int[][] wh = new int[N][2];
		
		for(int i=0; i<wh.length; i++) {
			st = new StringTokenizer(br.readLine());
			wh[i][0] = Integer.parseInt(st.nextToken());
			wh[i][1] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<wh.length; i++) {
			int cnt = 0;
			for(int j=0; j<wh.length; j++) {
				if(i != j) {
					if(wh[i][0] < wh[j][0] && wh[i][1] < wh[j][1]) {  // 덩치가 더 큰 경우
						cnt++;
					}
				}
			}
			bw.write(String.valueOf(cnt+1) + " ");
		}
		
		br.close();
		bw.close();
	}
	
}
