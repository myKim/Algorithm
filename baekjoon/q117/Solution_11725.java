package my.baekjoon.q117;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution_11725 {
	
	private static int[] parent;
	private static ArrayList<Integer>[] list; 
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		list = new ArrayList[N+1];
		for(int i=1; i<list.length; i++) {
			list[i] = new ArrayList<Integer>();
		}
		
		parent = new int[N+1];
		Arrays.fill(parent, -1);
		
		while(N-- > 1) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			list[A].add(B);
			list[B].add(A);
		}
		
		
		Queue<Integer> q = new LinkedList<>();
		parent[1] = 0;
		q.offer(1);
		
		while(!q.isEmpty()) {
			int n = q.poll();
			
			for(int i : list[n]) {
				if(parent[i] == -1) {
					parent[i] = n;
					q.add(i);
				}
			}
		}
		
		for(int i=2; i<parent.length; i++) {
			bw.write(String.valueOf(parent[i]));
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
}
