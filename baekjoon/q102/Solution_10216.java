package my.baekjoon.q102;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution_10216 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			int N = Integer.parseInt(br.readLine());
			
			Camp[] camps = new Camp[N];
			for(int i=0; i<N; i++) {
				st = new StringTokenizer(br.readLine());
				
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				int r = Integer.parseInt(st.nextToken());
				camps[i] = new Camp(x, y, r);
			}
			
			// 甘 积己
			ArrayList<Integer>[] map = new ArrayList[N];
			for(int i=0; i<map.length; i++) {
				map[i] = new ArrayList<Integer>();
			}
			
			for(int i=0; i<camps.length; i++) {
				for(int j=0; j<camps.length; j++) {
					if(i == j) continue;
					
					if(camps[i].isSameCamp(camps[j])) {
						map[i].add(j);
					}
				}
			}
			
			// Solution
			int group = 0;
			for(int i=0; i<camps.length; i++) {
				if(camps[i].group > 0) { continue; } // 捞固 弊缝 贸府等 版快
				
				Queue<Integer> q = new LinkedList<>();				
				
				camps[i].group = ++group;
				q.offer(i);
				
				while(!q.isEmpty()) {
					int src = q.poll();
					
					for(int tar : map[src]) {
						if(camps[tar].group <= 0) {
							camps[tar].group = group;
							q.offer(tar);
						}
					}
				}
			}
			
			bw.write(String.valueOf(group));
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
	
	public static class Camp {
		int x, y, r;
		int group;
		
		public Camp(int x, int y, int r) {
			this.x = x;
			this.y = y;
			this.r = r;
			this.group = 0;
		}
		
		public boolean isSameCamp(Camp c) {
			int a = (this.x - c.x) * (this.x - c.x);
			int b = (this.y - c.y) * (this.y - c.y);
			int rSum = (this.r + c.r) * (this.r + c.r);
			
			return (a + b) <= rSum;
			//return Math.pow((this.x - c.x), 2) + Math.pow((this.y - c.y), 2) <= Math.pow((this.r + c.r), 2);
		}
	}
	
}
