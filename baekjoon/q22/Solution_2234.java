import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_2234 {

	public static final int[][] dir = {{0,-1},{-1,0},{0,1},{1,0}};
	public static int[][] map;
	public static int[][] visit;
    public static int[] groupSize;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력 받기
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		map = new int[m][n];
		visit = new int[m][n];
		for(int i=0; i<map.length; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<map[i].length; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// 모든 방을 방문하여 Group으로 나누기
		int group = 0;
		for(int i=0; i<map.length; i++) {
			for(int j=0; j<map[i].length; j++) {
				if(visit[i][j] == 0) {
					dfs(++group, j, i);
				}
			}
		}
		
		// 가장 넓은 방의 넓이 구하기
		groupSize = new int[group+1];
		for(int[] arr : visit) {
			for(int i : arr) {
				groupSize[i]++;
			}
		}
		
		int maxGroupSize = 0;
		for(int i=0; i<groupSize.length; i++) {
			maxGroupSize = Math.max(maxGroupSize, groupSize[i]);
		}
		
		// 하나의 벽을 제거하여 얻을 수 있는 가장 넓은 방의 크기 구하기
		int maxUnionGroupSize = 0;
		for(int i=0; i<visit.length; i++) {
			for(int j=0; j<visit[i].length; j++) {
				maxUnionGroupSize = Math.max(maxUnionGroupSize, getMaxUnionGroupSize(j, i));
			}
		}
		
		// 결과 출력
		System.out.println(group);
		System.out.println(maxGroupSize);
		System.out.println(maxUnionGroupSize);
		
		br.close();
	}
	
	public static int getMaxUnionGroupSize(int x, int y) {
		int size = groupSize[visit[y][x]];
		
		for(int i=0; i<dir.length; i++) {
			int nextX = x + dir[i][1];
			int nextY = y + dir[i][0];
			
			if(isRange(map, nextX, nextY) && visit[y][x] != visit[nextY][nextX]) {
				size = Math.max(size, groupSize[visit[y][x]] + groupSize[visit[nextY][nextX]]);
			}
		}
		return size;
	}
	
	public static void dfs(int group, int x, int y) {
		if(visit[y][x] != 0) {
			return;
		}
		
		visit[y][x] = group;
		
		for(int i=0; i<dir.length; i++) {
			int mask = (1 << i);
			if((map[y][x] & mask) != 0) {
				continue;  // 벽이 막혀있으면 continue
			}
			
			int nextX = x + dir[i][1];
			int nextY = y + dir[i][0];
			if(isRange(map, nextX, nextY) && visit[nextY][nextX] == 0) {
				dfs(group, nextX, nextY);
			}
		}
	}
	
	public static boolean isRange(int[][] map, int x, int y) {
		return (0<=y && y<map.length) && (0<=x && x<map[y].length);
	}
	
}
