package my.baekjoon.q13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1325_2 {

	static int[] res;
	static boolean[] visit;
	static ArrayList<Integer>[] trust;
	static int max;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		trust = new ArrayList[N+1];
		for(int i=0; i<trust.length; i++) {
			trust[i] = new ArrayList<Integer>();
		}
		
		while(M-- > 0) {
			st = new StringTokenizer(br.readLine());
			int tar = Integer.parseInt(st.nextToken());
			int src = Integer.parseInt(st.nextToken());
			trust[tar].add(src);
		}
		
		// Solution
		res = new int[N+1];
		Arrays.fill(res, 0);
		visit = new boolean[N+1];
		
		max = -1;
		for(int i=1; i<res.length; i++) {
			visit = new boolean[N+1];
			//Arrays.fill(visit, false);	// 방문 초기화
			dfs(i);
		}
		
		// Output
		for(int i=1; i<res.length; i++) {
			if(res[i] == max) {
				bw.write(i + " ");
			}
		}
		
		br.close();
		bw.close();
	}
	
	public static void dfs(int i) {
		visit[i] = true;
		res[i]++;
		max = Math.max(max, res[i]);
		
		for(int src : trust[i]) {
			if(!visit[src]) {
				dfs(src);
			}
		}
	}
	
}
