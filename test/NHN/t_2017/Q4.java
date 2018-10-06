package my.nhn.t_2017;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q4 {

	public static int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[][] grid = new int[N][N];
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int j=0; j<N; j++) {
				grid[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		PriorityQueue<Integer> groupSize = new PriorityQueue<>();
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				int size = dfs(grid, i, j);
				if(size > 0) {
					groupSize.offer(size);
				}
			}
		}
		
		bw.write(String.valueOf(groupSize.size()));
		bw.newLine();
		while(!groupSize.isEmpty()) {
			bw.write(String.valueOf(groupSize.poll()));
			if(groupSize.size() != 0) {
				bw.write(" ");
			}
		}
		
		br.close();
		bw.close();
	}
	
	public static int dfs(int[][] grid, int x, int y) {
		if(!isRange(grid, x, y) || (grid[x][y] != 1)) {
			return 0;
		}
		
		grid[x][y] = 0;  // 방문처리
		int cnt = 1;
		
		for(int[] d : dir) {
			int nextX = x + d[0];
			int nextY = y + d[1];
			
			cnt += dfs(grid, nextX, nextY);
		}
		return cnt;
	}
	
	public static boolean isRange(int[][] grid, int x, int y) {
		return (0<=x && x<grid.length) && (0<=y && y<grid[x].length);
	}
	
}
