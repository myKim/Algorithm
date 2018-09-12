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
		
		// ���� ���� ���� ����Ʈ�� ���� 
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
			Collections.sort(m);  // ���� ���� ������������ ����
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
		
		// ù��° ��� push
		s.push(V);
		
		while(!s.isEmpty()) {
			int a = s.pop();
			
			if(visit[a]) { continue; }
			
			visit[a] = true;  // �湮 ó��
			sb.append(String.valueOf(a)).append(" ");  // ���� ������ ó��
			
			for(int i=map[a].size()-1; i>=0; i--) {
				int b = map[a].get(i);  // ū������ ���ÿ� �ִ´�.(���� ���� ���� ó��)
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
		
		// ù��° ��� �湮
		visit[V] = true;  // �湮 ó��
		q.offer(V);
		
		while(!q.isEmpty()) {
			int a = q.poll();
			sb.append(String.valueOf(a)).append(" ");  // ���� ������ ó��
			
			for(int b : map[a]) {
				if(!visit[b]) {
					visit[b] = true;  // �湮 ó��
					q.offer(b);
				}
			}
		}
		return sb.toString();
	}
	
}
