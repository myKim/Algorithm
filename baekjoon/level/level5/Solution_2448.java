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
		int height = N;  // Map�� ����
		int width = N * 2 - 1;  // Map�� �ʺ�
		
		char[][] map = new char[height][width];
		for(char[] arr : map) {  // ��ü Map�� �������� �ʱ�ȭ (����ó�� ���ϸ� ä���� ����)
			Arrays.fill(arr, ' ');
		}
		
		// Solution
		star(map, N, 0, width / 2);

		// ���
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
		star(map, n/2, x, y);  // ���� �ﰢ��
		star(map, n/2, x + n/2, y - n/2);  // ���� �ϴ� �ﰢ��
		star(map, n/2, x + n/2, y + n/2);  // ������ �ϴ� �ﰢ��
	}
}
