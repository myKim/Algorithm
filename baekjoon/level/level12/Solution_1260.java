package my.level12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Solution_1260 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		// 정점 관계 인접 리스트로 구현 
		ArrayList<Integer>[] map = new ArrayList[N + 1];
		for(int i=0; i<map.length; i++) {
			map[i] = new ArrayList<>();
		}
		while(M-- > 0) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int t = Integer.parseInt(st.nextToken());
			
			if(!map[s].contains(t)) {
				map[s].add(t);
			}
			if(!map[t].contains(s)) {
				map[t].add(s);
			}
		}
		for(ArrayList<Integer> m : map) {
			Collections.sort(m);  // 정점 관계 오름차순으로 정렬
		}
		
		// Solution
		bw.write(dfs(map, V));
		bw.newLine();
		bw.write(bfs(map, V));
		bw.newLine();
		
		br.close();
		bw.close();
	}
	
	
	public static String dfs(ArrayList<Integer>[] map, int V) {
		boolean[] visit = new boolean[map.length + 1];
		Arrays.fill(visit, false);
		
		StringBuilder sb = new StringBuilder();
		Stack<Integer> s = new Stack<>();
		
		// 첫번째 노드 push
		s.push(V);
		
		while(!s.isEmpty()) {
			int a = s.pop();
			
			if(visit[a]) { continue; }
			
			visit[a] = true;  // 방문 처리
			sb.append(String.valueOf(a)).append(" ");  // 실제 데이터 처리
			
			for(int i=map[a].size()-1; i>=0; i--) {
				int b = map[a].get(i);  // 큰값부터 스택에 넣는다.(작은 값이 먼저 처리)
				if(!visit[b]) {
					s.push(b);
				}
			}
		}
		return sb.toString();
	}
	
	public static String bfs(ArrayList<Integer>[] map, int V) {
		boolean[] visit = new boolean[map.length + 1];
		Arrays.fill(visit, false);
		
		StringBuilder sb = new StringBuilder();
		Queue<Integer> q = new LinkedList<>();
		
		// 첫번째 노드 방문
		visit[V] = true;  // 방문 처리
		q.offer(V);
		
		while(!q.isEmpty()) {
			int a = q.poll();
			sb.append(String.valueOf(a)).append(" ");  // 실제 데이터 처리
			
			for(int b : map[a]) {
				if(!visit[b]) {
					visit[b] = true;  // 방문 처리
					q.offer(b);
				}
			}
		}
		return sb.toString();
	}
	
}
