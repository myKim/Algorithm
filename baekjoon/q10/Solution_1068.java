package my.baekjoon.q10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1068 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		CustomTree tree = new CustomTree(50);
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			int parent = Integer.parseInt(st.nextToken());
			tree.add(i, parent);
		}
		
		int D = Integer.parseInt(br.readLine());
		tree.delete(D);
		
		System.out.print(tree.getLeafCount());
		
		br.close();
	}
	
	public static class CustomTree {
		int[] parent;
		
		public CustomTree(int maxNodeCnt) {
			parent = new int[maxNodeCnt];
			Arrays.fill(parent, -2);  // -2 는 노드가 없는 상태
		}
		
		public void add(int child, int parent) {
			this.parent[child] = parent;
		}
		
		public int getLeafCount() {
			int cnt = 0;
			boolean[] isParent = new boolean[parent.length];
			
			for(int i=0; i<parent.length; i++) {
				if(parent[i] >= 0) {
					isParent[parent[i]] = true;
				}
			}
			for(int i=0; i<isParent.length; i++) {
				if(!isParent[i] && parent[i]>-2) {
					cnt++;
				}
			}
			
			return cnt;
		}
		
		// dfs를 이용해서 삭제한 노드를 부모로 가진 노드 모두 삭제
		public void delete(int node) {
			if(parent[node] == -2) return;
			
			parent[node] = -2;
			
			for(int i=0; i<parent.length; i++) {
				if(parent[i] == node) {
					delete(i);
				}
			}
		}
	}
	
}
