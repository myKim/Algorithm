package my.nhn.t_2018;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q2 {

	static String[][] grid;
	static String[][] tmpGrid;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		
		grid = new String[N][N];
		tmpGrid = new String[N][N];
		for(int i=0; i<grid.length; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<grid[i].length; j++) {
				grid[i][j] = st.nextToken();
			}
		}
		rotateGrid(W, N, 0, 0);
		
		for(int i=0; i<grid.length; i++) {
			for(int j=0; j<grid[i].length; j++) {
				bw.write(grid[i][j]);
				if(j != grid[i].length-1) {
					bw.write(" ");
				}
			}
			if(i != grid.length-1) {
				bw.newLine();
			}
		}
		
		br.close();
		bw.close();
	}
	
	public static void rotateGrid(int W, int gridSize, int x, int y) {
		int rotateSize = (gridSize-1)*4;
		int rotateCnt = W % rotateSize;
		
		// 그리드 회전
		String[] tmp = new String[rotateSize];
		int curX = x;
		int curY = y;
		for(int i=0; i<tmp.length; i++) {
			tmp[i] = grid[curX][curY];
			
			if(i < (gridSize-1)) 
				curY++;
			else if(i<(gridSize-1)*2)
				curX++;
			else if(i<(gridSize-1)*3)
				curY--;
			else
				curX--;
		}
		
		String[] tmp2 = new String[tmp.length];
		for(int i=0; i<tmp.length; i++) {
			tmp2[i] = tmp[(tmp.length - rotateCnt + i) % rotateSize];
		}
		
		curX = x;
		curY = y;
		for(int i=0; i<tmp.length; i++) {
			grid[curX][curY] = tmp2[i];
			
			if(i < (gridSize-1))
				curY++;
			else if(i<(gridSize-1)*2)
				curX++;
			else if(i<(gridSize-1)*3)
				curY--;
			else
				curX--;
		}
		
		int innerGridSize = gridSize-2;
		if(innerGridSize > 1) {
			rotateGrid(-W, innerGridSize, x+1, y+1);
		}
	}
	
}
