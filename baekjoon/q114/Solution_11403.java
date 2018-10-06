package my.baekjoon.q114;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_11403 {

	static int[][] adj;
	static int[][] res;
	static boolean[] visit;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		adj = new int[N+1][N+1];
		res = new int[N+1][N+1];
		visit = new boolean[N+1];
		
		for(int i=1; i<adj.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=1; j<adj[i].length; j++) {
				adj[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=1; i<adj.length; i++) {
			for(int j=1; j<adj[i].length; j++) {
				Arrays.fill(visit, false);
				
				visit[i] = true;
				if(dfs(i, j)) {
					res[i][j] = 1;
				}
			}
		}
		
		for(int i=1; i<res.length; i++) {
			for(int j=1; j<res[i].length; j++) {
				bw.append(String.valueOf(res[i][j]) + " ");
			}
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
	private static boolean dfs(int x, int y) {
		if(adj[x][y] == 1) return true;
		
		for(int i=1; i<adj[x].length; i++) {
			if(!visit[i] && adj[x][i] == 1) {
				visit[i] = true;
				if(dfs(i, y)) {
					return true;
				}
			}
		}
		return false;
	}
	
}