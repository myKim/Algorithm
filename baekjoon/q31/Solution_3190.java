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
	
		int N; // ������ ũ�� (2 <= N <= 100)
		int K; // ����� ���� (0 <= K <= 100)
		int L; // ���� ���� ��ȯ Ƚ�� (1 <= L <= 100)
		
		/**********************************************
		 * 1. Input
		 **********************************************/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		int[][] map = new int[N+1][N+1];
		for(int i=0; i<map.length; i++) {
			Arrays.fill(map[i], -2);	// �̹湮 : -2 / ��� : -1 / 0~3 : ���� ��(����)
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
		int[][] direction = {{0,1},{1,0},{0,-1},{-1,0}}; // ��, ��, ��, ��
		
		int curDir = 0;	// ���� ���� : ��
		map[1][1] = curDir;	// ���� �ʱ� ��ġ �� ���� ����
		Position head = new Position(1, 1);
		Position tale = new Position(1, 1);
		
		int curSec = 0;	// ���� ��
		while(true) {
			curSec++;
			
			// ���� ĭ ��ġ ���
			int nextX, nextY;
			nextX = head.x + direction[curDir][0];
			nextY = head.y + direction[curDir][1];
			
			// ���� ���� �΋H�� ���
			if((nextX < 1 || N < nextX) || (nextY < 1 || N < nextY)) {
				break;
			}
			// �ڱ� ���� �΋H�� ���
			if(map[nextX][nextY] >= 0) {
				break;
			}
			
			// ���� �ð��� ������ȯ �ð����� üũ 
			if(!queue.isEmpty() && queue.peek().sec == curSec) {
				TurnInfo turnInfo = queue.poll();
				int turn = turnInfo.turn;
				
				// ���� ��ȯ ����
				curDir = (direction.length + curDir + turn) % direction.length;
			}
			
			// ���� ����ĭ���� �̵� (����� ���� ���)
			if(map[nextX][nextY] != -1) {
				int taleX = tale.x;  
				int taleY = tale.y;
				tale.x += direction[map[taleX][taleY]][0];
				tale.y += direction[map[taleX][taleY]][1];
				
				map[taleX][taleY] = -2;
			}
			
			// �Ӹ� ����ĭ���� �̵�
			head.move(nextX, nextY);
			map[nextX][nextY] = curDir;	// ���� ���� ���� ĭ�� ��ġ
		}
		
		System.out.println(curSec);	// ��� ���
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
