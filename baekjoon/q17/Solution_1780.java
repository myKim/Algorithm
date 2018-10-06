package my.baekjoon.q17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1780 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 1. Input
		int N = Integer.parseInt(br.readLine());
		
		int[][] paper = new int[N][N];
		for(int i=0; i<paper.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int j=0; j<paper[i].length; j++) {
				paper[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// 2. Solution
		int[] result = new int[3];
		Arrays.fill(result, 0);
		
		calPaperCnt(paper, 0, 0, paper.length, result);
		
		bw.write(String.valueOf(result[0]));
		bw.newLine();
		bw.write(String.valueOf(result[1]));
		bw.newLine();
		bw.write(String.valueOf(result[2]));

		bw.flush();
		bw.close();
		br.close();
	}
	
	public static void calPaperCnt(int[][] paper, int x, int y, int size, int[] result) {
		if(isSingleColor(paper, x, y, size)) {
			result[paper[x][y]+1]++;
		}
		else {
			int newSize = size / 3;
			calPaperCnt(paper, x, y, newSize, result);
			calPaperCnt(paper, x + newSize, y, newSize, result);
			calPaperCnt(paper, x + newSize * 2, y, newSize, result);

			calPaperCnt(paper, x, y + newSize, newSize, result);
			calPaperCnt(paper, x + newSize, y + newSize, newSize, result);
			calPaperCnt(paper, x + newSize * 2, y + newSize, newSize, result);
			
			calPaperCnt(paper, x, y + newSize * 2, newSize, result);
			calPaperCnt(paper, x + newSize, y + newSize * 2, newSize, result);
			calPaperCnt(paper, x + newSize * 2, y + newSize * 2, newSize, result);
		}
	}
	
	public static boolean isSingleColor(int[][] paper, int x, int y, int size) {
		if(paper == null) return false;
		
		int color = paper[x][y];
		
		for(int i=x; i<x+size; i++) {
			for(int j=y; j<y+size; j++) {
				if(paper[i][j] != color) {
					return false;
				}
			}
		}
		return true;
	}
}
