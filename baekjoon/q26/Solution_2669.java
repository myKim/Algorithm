package my.baekjoon.q26;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_2669 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = 4;
		int[][] map = new int[100][100];
		
		int area = 0;
		while(N-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			for(int i=y1; i<y2; i++) {
				for(int j=x1; j<x2; j++) {
					if(map[i][j] == 0) {
						map[i][j] = 1;
						area++;
					}
				}
			}
		}
		
		bw.write(String.valueOf(area));
		
		br.close();
		bw.close();
	}
}