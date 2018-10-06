package my.nhn.t_2017;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q5 {
	// 2:37 ~ 3:21

	static char[][] map;
	static int[][] res;
	static int[][] dir = {{-1,0},{0,-1},{0,1},{1,0}};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		map = new char[N][N];
		res = new int[N][N];
		for(int[] arr : res) {
			Arrays.fill(arr, -2);
		}
		
		
		for(int i=0; i<map.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<map[i].length; j++) {
				map[i][j] = st.nextToken().charAt(0);
			}
		}
		
		// Solution
		for(int i=0; i<map.length; i++) {
			for(int j=0; j<map[i].length; j++) {
				dfs(map, i, j);
			}
		}
		
		
		int maxLen = 0;
		for(int i=0; i<res.length; i++) {
			for(int j=0; j<res[i].length; j++) {
				maxLen = Math.max(maxLen, String.valueOf(res[i][j]).length());
			}
		}
		
		String format = new StringBuilder().append("%").append(String.valueOf(maxLen)).append("d").toString();
		for(int i=0; i<res.length; i++) {
			for(int j=0; j<res[i].length; j++) {
				bw.write(String.format(format, res[i][j]));
				
				if(j != res[i].length-1) {
					bw.write(" ");
				}
			}
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}

	public static void dfs(char[][] map, int x, int y) {
		if(!isRange(map, x, y) || res[x][y] != -2) {
			return;
		}
		if(map[x][y] == '0') {
			res[x][y] = -1;
			return;
		}
		
		res[x][y] = (map[x][y] - 'A') * 16;  
		
		for(int i=0; i<dir.length; i++) {
			int nextX = x + dir[i][0];
			int nextY = y + dir[i][1];
			
			if(isRange(map, nextX, nextY)) {
				if(map[nextX][nextY] == map[x][y]) {
					res[x][y] += (1 << i);
					dfs(map, nextX, nextY);
				}
			}
		}
	}
	
	public static boolean isRange(char[][] map, int x, int y) {
		return (0 <= x && x < map.length) && (0 <= y && y < map[x].length);
	}
	
}
