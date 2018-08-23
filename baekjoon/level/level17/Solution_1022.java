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
		int[][] dir = {{0,1}, {-1,0}, {0,-1}, {1,0}}; // 우 상 좌 하
		
		int r = 0;
		int c = 0;
		int curNum = 1;
		board[r+max][c+max] = curNum++;
		c += 1;
		
		int curLevel = 1;
		int curDir = 1; // 상
		
		while((-max <= r && r <= max) && (-max <= c && c <= max)) {
			// 이미 숫자가 채워져 있을 경우, 다음레벨로 조정
			if(board[r+max][c+max] != 0) {
				c += 1; // 우
				r += 1; // 하
				curLevel++;
				continue;
			}
			
			// 숫자 기록
			board[r+max][c+max] = curNum++;
			
			// 다음칸 계산
			if(Math.abs(r) == curLevel && Math.abs(c) == curLevel) {
				curDir = (dir.length + curDir + 1) % dir.length; // 방향전환
			}
			
			r += dir[curDir][0];
			c += dir[curDir][1];
		}
		
		/***********************************************************
		 * 3. Output
		 ***********************************************************/
		// 출력값 최대 숫자 취득 (각 모서리 중 최대값)
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
