package my.level5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Solution_2448 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int height = N;  // Map의 높이
		int width = N * 2 - 1;  // Map의 너비
		
		char[][] map = new char[height][width];
		for(char[] arr : map) {  // 전체 Map을 공백으로 초기화 (공백처리 안하면 채점시 오답)
			Arrays.fill(arr, ' ');
		}
		
		// Solution
		star(map, N, 0, width / 2);

		// 출력
		for(char[] arr : map) {
			for(char c : arr) {
				bw.write(c);
			}
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
	public static void star(char[][] map, int n, int x, int y) {
		if(n == 3) {
			map[x][y]     = '*';
			map[x+1][y-1] = '*';
			map[x+1][y+1] = '*';
			map[x+2][y-2] = '*';
			map[x+2][y-1] = '*';
			map[x+2][y]   = '*';
			map[x+2][y+1] = '*';
			map[x+2][y+2] = '*';
			return;
		}
		star(map, n/2, x, y);  // 현재 삼각형
		star(map, n/2, x + n/2, y - n/2);  // 왼쪽 하단 삼각형
		star(map, n/2, x + n/2, y + n/2);  // 오른쪽 하단 삼각형
	}
}
