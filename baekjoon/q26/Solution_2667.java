package my.baekjoon.q26;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution_2667 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[][] map = new int[N+1][N+1];
		
		for(int i=1; i<=N; i++) {
			char[] line = br.readLine().toCharArray();
			
			for(int j=1; j<=line.length; j++) {
				map[i][j] = line[j-1] - '0';
			}
		}
	
		// Solution
		PriorityQueue<Integer> q = solution(map);
		
		bw.write(String.valueOf(q.size()));
		bw.newLine();
		while(!q.isEmpty()) {
			bw.write(String.valueOf(q.poll()));
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
	public static PriorityQueue<Integer> solution(int[][] map) {
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		
		int[][] visit = new int[map.length][map[0].length];
		for(int[] v : visit) {
			Arrays.fill(v, 0);
		}
		
		int group = 0;
		for(int i=1; i<map.length; i++) {
			for(int j=1; j<map[i].length; j++) {
				if(map[i][j] == 1 && visit[i][j] == 0) {
					int cnt = dfs(map, visit, i, j, ++group);
					q.offer(cnt);
				}
			}
		}
		return q;
	}
	
	public static int dfs(int[][] map, int[][] visit, int i, int j, int group) { 
		int cnt = 0;
		int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
		
		if(map[i][j] == 1) {
			visit[i][j] = group;
			cnt++;
			
			for(int[] d : dir) {
				int x = i + d[0];
				int y = j + d[1];
				
				if(isRange(map, x, y)) {
					if(map[x][y] == 1 && visit[x][y] == 0) {
						cnt += dfs(map, visit, x, y, group);
					}
				}
			}
		}
		
		return cnt;
	}
	
	public static boolean isRange(int[][] map, int x, int y) {
		return (0<x) && (x<map.length) && (0<y) && (y<map[x].length);
	}
	
}
