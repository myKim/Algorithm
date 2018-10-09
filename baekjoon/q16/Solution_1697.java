package my.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution_1697 {
	
	private static final int MAX_RANGE = 100000;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int res = solution(N, K);
		
		bw.write(String.valueOf(res));
		
		br.close();
		bw.close();
	}
	
	public static int solution(int N, int K) {
		int[] visit = new int[MAX_RANGE+1];
		Arrays.fill(visit, -1);
		
		Queue<Integer> q = new LinkedList<>();
		int sec = 0;
		
		q.offer(N);
		visit[N] = 0;
		while(!q.isEmpty()) {
			int n = q.poll();
			if(n == K) {
				sec = visit[n];
				break;
			}
			
			int nextX;
			nextX = n+1;
			if(isRange(nextX) && visit[nextX]<0) {
				q.offer(nextX);
				visit[nextX] = visit[n]+1;
			}
			nextX = n-1;
			if(isRange(nextX) && visit[nextX]<0) {
				q.offer(nextX);
				visit[nextX] = visit[n]+1;
			}
			nextX = n*2;
			if(isRange(nextX) && visit[nextX]<0) {
				q.offer(nextX);
				visit[nextX] = visit[n]+1;
			}
		}
		
		return sec;
	}
	
	public static boolean isRange(int N) {
		return (0<=N && N<=MAX_RANGE);
	}
}
