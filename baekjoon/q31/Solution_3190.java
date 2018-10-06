package my.baekjoon.q31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution_3190 {

	public static void main(String[] args) throws IOException {
	
		int N; // 보드의 크기 (2 <= N <= 100)
		int K; // 사과의 개수 (0 <= K <= 100)
		int L; // 뱀의 방향 전환 횟수 (1 <= L <= 100)
		
		/**********************************************
		 * 1. Input
		 **********************************************/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		int[][] map = new int[N+1][N+1];
		for(int i=0; i<map.length; i++) {
			Arrays.fill(map[i], -2);	// 미방문 : -2 / 사과 : -1 / 0~3 : 뱀의 몸(방향)
		}
		
		K = Integer.parseInt(br.readLine());
		for(int i=0; i<K; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			map[x][y] = -1;
		}
		
		L = Integer.parseInt(br.readLine());
		Queue<TurnInfo> queue = new LinkedList<TurnInfo>(); 
		for(int i=0; i<L; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int sec = Integer.parseInt(st.nextToken());
			int turn = st.nextToken().equals("D") ? 1 : -1;
			
			queue.offer(new TurnInfo(sec, turn));
		}
		
		
		/**********************************************
		 * 2. Solution
		 **********************************************/
		int[][] direction = {{0,1},{1,0},{0,-1},{-1,0}}; // 동, 남, 서, 북
		
		int curDir = 0;	// 현재 방향 : 동
		map[1][1] = curDir;	// 뱀의 초기 위치 및 방향 설정
		Position head = new Position(1, 1);
		Position tale = new Position(1, 1);
		
		int curSec = 0;	// 현재 초
		while(true) {
			curSec++;
			
			// 다음 칸 위치 계산
			int nextX, nextY;
			nextX = head.x + direction[curDir][0];
			nextY = head.y + direction[curDir][1];
			
			// 보드 벽에 부딫힐 경우
			if((nextX < 1 || N < nextX) || (nextY < 1 || N < nextY)) {
				break;
			}
			// 자기 몸에 부딫힐 경우
			if(map[nextX][nextY] >= 0) {
				break;
			}
			
			// 현재 시간이 방향전환 시간인지 체크 
			if(!queue.isEmpty() && queue.peek().sec == curSec) {
				TurnInfo turnInfo = queue.poll();
				int turn = turnInfo.turn;
				
				// 방향 전환 연산
				curDir = (direction.length + curDir + turn) % direction.length;
			}
			
			// 꼬리 다음칸으로 이동 (사과가 없을 경우)
			if(map[nextX][nextY] != -1) {
				int taleX = tale.x;  
				int taleY = tale.y;
				tale.x += direction[map[taleX][taleY]][0];
				tale.y += direction[map[taleX][taleY]][1];
				
				map[taleX][taleY] = -2;
			}
			
			// 머리 다음칸으로 이동
			head.move(nextX, nextY);
			map[nextX][nextY] = curDir;	// 뱀의 몸을 다음 칸에 위치
		}
		
		System.out.println(curSec);	// 결과 출력
	}
	
	
	static class Position {
		int x;
		int y;
		
		public Position(int x, int y) {
			this.x = x;
			this.y = y;
		}
		public void move(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	static class TurnInfo {
		int sec;
		int turn;
		
		public TurnInfo(int sec, int turn) {
			this.sec = sec;
			this.turn = turn;
		}
	}
}
