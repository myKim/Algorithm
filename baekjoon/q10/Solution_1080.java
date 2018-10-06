package my.baekjoon.q10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1080 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] m1 = new int[N][M];
		int[][] m2 = new int[N][M];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				m1[i][j] = br.read() - '0';
			}
			br.readLine();
		}
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				m2[i][j] = br.read() - '0';
			}
			br.readLine();
		}
		
		int cnt = 0;
		for(int i=0; i<=N-3; i++) {
			for(int j=0; j<=M-3; j++) {
				if(m1[i][j] != m2[i][j]) {
					trans(m1, i, j);
					cnt++;
				}
			}
		}
		
		if(isSame(m1, m2)) {
			System.out.println(cnt);
		}
		else {
			System.out.println(-1);
		}
		
		br.close();
	}
	
	public static void trans(int[][] matrix, int x, int y) {
		if(0<=x && x<=matrix.length-3 && 0<=y && y<=matrix[x].length-3) {
			for(int i=x; i<x+3; i++) {
				for(int j=y; j<y+3; j++) {
					matrix[i][j] ^= 1; // toggle
				}
			}
		}
	}
	
	public static boolean isSame(int[][] m1, int[][] m2) {
		for(int i=0; i<m1.length; i++) {
			for(int j=0; j<m1[i].length; j++) {
				if(m1[i][j] != m2[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
	
}