package my.baekjoon.q75;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution_7576 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		int[][] box = new int[N][M];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j=0; j<M; j++) {
				box[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// 2. Solution
		bw.write(String.valueOf(solution(box)));
		
		br.close();
		bw.close();
	}
	
	
	public static int solution(int[][] box) {
		int res = 0;
		int tomatoCnt = 0;
		
		Queue<Pair> q = new LinkedList<Pair>();
		
		for(int i=0; i<box.length; i++) {
			for(int j=0; j<box[i].length; j++) {
				if(box[i][j] == 1) {
					q.offer(new Pair(i, j));
				}
				else if(box[i][j] == 0) {
					tomatoCnt++;
				}
			}
		}
		
		if(tomatoCnt == 0) {
			return 0;
		}
		
		boolean[][] visit = new boolean[box.length][box[0].length];
		for(int i=0; i<visit.length; i++) {
			Arrays.fill(visit[i], false);
		}
		int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};
		
		while(!q.isEmpty()) {
			res++;
			int cnt = q.size();
			
			while(cnt-- > 0) {
				Pair pair = q.poll();
				visit[pair.x][pair.y] = true;
				
				for(int d[] : dir) {
					Pair next = new Pair(pair.x + d[0], pair.y + d[1]);
					
					if(next.x < 0 || box.length <= next.x || next.y < 0 || box[next.x].length <= next.y) {
						continue;
					}
					if(visit[next.x][next.y]) {
						continue;
					}
					if(box[next.x][next.y] == 0) {
						box[next.x][next.y] = 1;
						q.offer(next);
						
						if(--tomatoCnt == 0) {
							return res;
						}
					}
				}
			}
		}
		
		return -1;
	}
	
	public static class Pair {
		int x, y;
		
		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
}
