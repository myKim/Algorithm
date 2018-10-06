package my.baekjoon.q21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution_2178 {

	public static void main(String[] args) throws IOException {
		/********************************************
		 * 1. Input
		 ********************************************/
		int N, M;
		int[][] map;
		int[][] visit;
		int[][] direction =  {{1,0},{-1,0},{0,1},{0,-1}}; // South, North, East, West
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[N+1][M+1];
		visit = new int[N+1][M+1];
		
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=M; j++) {
				int tmp = br.read();
				
				while(tmp == '\n' || tmp == '\r' || tmp == ' ') {
					tmp = br.read();
				}
				map[i][j] = tmp - '0';
			}
		}
		
		
		/********************************************
		 * 2. Solution
		 ********************************************/
		for(int i=0; i<visit.length; i++) {
			Arrays.fill(visit[i], -1);
		}
		
		Queue<Position> queue = new LinkedList<Position>();
		Position pos = null;
		
		queue.offer(new Position(1, 1));
		visit[1][1] = 1;
		
		while(!queue.isEmpty()) {
			pos = queue.poll();
			int x = pos.x;
			int y = pos.y;
			
			if(x == N && y == M) {
				break;
			}
			
			for(int i=0; i<direction.length; i++) {
				int nextX = x + direction[i][0];
				int nextY = y + direction[i][1];
				
				if(((1<=nextX && nextX<=N) && (1<=nextY && nextY<=M)) 
					&& (map[nextX][nextY] != 0) 
					&& (visit[nextX][nextY] == -1)) {
					queue.offer(new Position(nextX, nextY));
					visit[nextX][nextY] = visit[x][y] + 1;
				}
			}
		}
		
		if(pos.x == N && pos.y == M) {
			System.out.println(visit[pos.x][pos.y]);
		}
		else {
			System.out.println("unreachable position");
		}
	}
}

class Position {
	int x, y;
	
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
}