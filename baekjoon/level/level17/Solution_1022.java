package my.level17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_1022 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		/***********************************************************
		 * 1. Input
		 ***********************************************************/
		int r1, c1, r2, c2;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		r1 = Integer.parseInt(st.nextToken());
		c1 = Integer.parseInt(st.nextToken());
		r2 = Integer.parseInt(st.nextToken());
		c2 = Integer.parseInt(st.nextToken());
		
		/***********************************************************
		 * 2. Solution
		 ***********************************************************/
		int max = Math.abs(r1);
		max = Math.max(max, Math.abs(c1));
		max = Math.max(max, Math.abs(r2));
		max = Math.max(max, Math.abs(c2));
		
		int[][] board = new int[max*2 + 1][max*2 + 1];
		int[][] dir = {{0,1}, {-1,0}, {0,-1}, {1,0}}; // �� �� �� ��
		
		int r = 0;
		int c = 0;
		int curNum = 1;
		board[r+max][c+max] = curNum++;
		c += 1;
		
		int curLevel = 1;
		int curDir = 1; // ��
		
		while((-max <= r && r <= max) && (-max <= c && c <= max)) {
			// �̹� ���ڰ� ä���� ���� ���, ���������� ����
			if(board[r+max][c+max] != 0) {
				c += 1; // ��
				r += 1; // ��
				curLevel++;
				continue;
			}
			
			// ���� ���
			board[r+max][c+max] = curNum++;
			
			// ����ĭ ���
			if(Math.abs(r) == curLevel && Math.abs(c) == curLevel) {
				curDir = (dir.length + curDir + 1) % dir.length; // ������ȯ
			}
			
			r += dir[curDir][0];
			c += dir[curDir][1];
		}
		
		/***********************************************************
		 * 3. Output
		 ***********************************************************/
		// ��°� �ִ� ���� ��� (�� �𼭸� �� �ִ밪)
		int maxNum = board[r1+max][c1+max];
		maxNum = Math.max(maxNum, board[r1+max][c2+max]);
		maxNum = Math.max(maxNum, board[r2+max][c1+max]);
		maxNum = Math.max(maxNum, board[r2+max][c2+max]);
		String str = "%" + String.valueOf(String.valueOf(maxNum).length()) + "d";
		
		for(int i=r1+max; i<=r2+max; i++) {
			for(int j=c1+max; j<=c2+max; j++) {
				if(j != c1+max) bw.write(" ");
				bw.write(String.format(str, board[i][j]));
			}
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
}
