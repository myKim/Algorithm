package my.baekjoon.q100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution_10026 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		char[][] map1 = new char[N][];  // �Ϲ� ��
		for(int i=0; i<N; i++) {
			map1[i] = br.readLine().toCharArray();
		}
		char[][] map2 = createColorBlindMap(map1);  // ����� ��
		
		bw.write(bfs(map1) + " " + bfs(map2));  // BFS�� ��� ���
		
		br.close();
		bw.close();
	}
	
	// �Ϲ� ���� �������� ���ϻ��� �� ���� (�׸��� ��� ����� ����)
	public static char[][] createColorBlindMap(char[][] map) {
		char[][] res = new char[map.length][];
		
		for(int i=0; i<res.length; i++) {
			res[i] = new char[map[i].length];
			
			for(int j=0; j<res[i].length; j++) {
				res[i][j] = (map[i][j] == 'G') ? 'R' : map[i][j];
			}
		}
		
		return res;
	}
	
	// BFS �� Ž�� �� Group ���� ��ȯ
	public static int bfs(char[][] map) {
		int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};  // �̵�����
		int[][] visit = new int[map.length][map[0].length];  // �湮���� (0: �̹湮)
		for(int[] arr : visit) {
			Arrays.fill(arr, 0);
		}
		
		int group = 0;
		for(int i=0; i<map.length; i++) {
			for(int j=0; j<map[i].length; j++) {
				if(visit[i][j] > 0) continue;  // �̹� ó���� ��ǥ�� ��� continue
				
				Queue<Pair> q = new LinkedList<>();
				q.offer(new Pair(i, j));
				visit[i][j] = ++group;
				
				while(!q.isEmpty()) {
					Pair p = q.poll();
					
					for(int[] d : dir) {
						int nextX = p.x + d[0];
						int nextY = p.y + d[1];
						
						if(isRange(map, nextX, nextY)) {
							if(map[i][j] == map[nextX][nextY] && visit[nextX][nextY] <= 0) {
								q.offer(new Pair(nextX, nextY));
								visit[nextX][nextY] = group;
							}
						}
					}
				}
			}
		}
		return group;
	}
	
	// ��ǥ�� �� ���ο� �ִ��� Ȯ��
	public static boolean isRange(char[][] map, int x, int y) {
		return (0 <= x && x < map.length) && (0 <= y && y < map[x].length);
	}
	
	// ��ǥ class
	public static class Pair {
		int x;
		int y;
		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
