package my.baekjoon.q109;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_10974_1 {
	
	private static BufferedReader br;
	private static BufferedWriter bw;
	private static boolean[] isVisit;
	private static int[] arr;
	private static int N;
	
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=N; i++) {
			isVisit = new boolean[N+1];
			arr = new int[N];
			
			dfs(i, 0);
		}
		
		br.close();
		bw.close();
	}
	
	public static void dfs(int n, int idx) throws IOException {
		if(isVisit[n]) return;
		
		arr[idx++] = n;
		isVisit[n] = true;
		
		if(idx >= N) {
			for(int i : arr) {
				bw.write(i + " ");
			}
			bw.newLine();
		}
		else {
			for(int i=1; i<isVisit.length; i++) {
				if(!isVisit[i]) {
					dfs(i, idx);
				}
			}
		}
		
		isVisit[n] = false;
	}
	
}
