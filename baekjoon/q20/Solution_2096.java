package my.baekjoon.q20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_2096 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		int N = Integer.parseInt(br.readLine());
		int[][] map = new int[N][3];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			map[i][0] = Integer.parseInt(st.nextToken());
			map[i][1] = Integer.parseInt(st.nextToken());
			map[i][2] = Integer.parseInt(st.nextToken());
		}
		
		// Solution
		int[][] dpMin = new int[N][3];
		int[][] dpMax = new int[N][3];
		dpMin[0][0] = dpMax[0][0] = map[0][0];
		dpMin[0][1] = dpMax[0][1] = map[0][1];
		dpMin[0][2] = dpMax[0][2] = map[0][2];
		
		for(int i=1; i<N; i++) {
			for(int j=0; j<3; j++) {
				int min = dpMin[i-1][j];
				min = (j-1 >= 0) ? Math.min(min, dpMin[i-1][j-1]) : min;
				min = (j+1 < 3) ? Math.min(min, dpMin[i-1][j+1]) : min;
				dpMin[i][j] = map[i][j] + min;
				
				int max = dpMax[i-1][j];
				max = (j-1 >= 0) ? Math.max(max, dpMax[i-1][j-1]) : max;
				max = (j+1 < 3) ? Math.max(max, dpMax[i-1][j+1]) : max;
				dpMax[i][j] = map[i][j] + max;
			}
		}
		
		int resMin = Integer.MAX_VALUE, resMax = Integer.MIN_VALUE;
		for(int i=0; i<3; i++) {
			if(resMin > dpMin[dpMin.length-1][i]) {
				resMin = dpMin[dpMin.length-1][i];
			}
			if(resMax < dpMax[dpMax.length-1][i]) {
				resMax = dpMax[dpMax.length-1][i];
			}
		}
		
		bw.write(resMax + " " + resMin);
		
		br.close();
		bw.close();
	}
}
