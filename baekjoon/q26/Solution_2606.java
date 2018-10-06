package my.baekjoon.q26;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution_2606 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		boolean[] visit = new boolean[N+1];
		Arrays.fill(visit, false);
		
		boolean[][] conn = new boolean[N+1][N+1];
		for(boolean[] m : conn) {
			Arrays.fill(m, false);
		}
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			conn[a][b] = true;
			conn[b][a] = true;
		}
		
		// Solution
		Queue<Integer> q = new LinkedList<Integer>();
		int cnt = 0;
		
		visit[1] = true;
		q.offer(1);
		
		while(!q.isEmpty()) {
			int com = q.poll();
			
			for(int i=1; i<conn.length; i++) {
				if(conn[com][i]) { 
					if(!visit[i]) {
						visit[i] = true;
						q.offer(i);
						cnt++;
					}
				}
			}
		}
		
		bw.write(String.valueOf(cnt));
		
		br.close();
		bw.close();
	}
	
}
