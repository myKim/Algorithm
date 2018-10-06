package my.baekjoon.q17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_1717 {

	public static int[] parent;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
	
		parent = new int[n+1];
		for(int i=0; i<parent.length; i++) {
			parent[i] = i;
		}
		
		while(m-- > 0) {
			st = new StringTokenizer(br.readLine());
			
			int cmd = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			switch(cmd) {
			case 0: // 합집합
				union(a, b);
				break;
			case 1: // 같은 집합인지 확인
				bw.write((isGroup(a, b)) ? "YES" : "NO");
				bw.newLine();
				break;
			}
		}
		
		br.close();
		bw.close();
	}
	
	public static int getParent(int i) {
		if(i == parent[i]) {
			return i;
		}
		return getParent(parent[i]);
	}
	
	public static void union(int a, int b) {
		int parentA = getParent(a);
		int parentB = getParent(b);
		
		if(parentA < parentB) {
			parent[parentB] = parentA;
		}
		else {
			parent[parentA] = parentB;
		}
	}
	
	public static boolean isGroup(int a, int b) {
		return getParent(a) == getParent(b);
	}
}