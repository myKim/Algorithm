package my.baekjoon.q109;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_10974_2 {
	
	private static BufferedReader br;
	private static BufferedWriter bw;
	private static boolean[] isVisit;
	private static int[] arr;
	
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		isVisit = new boolean[N+1];
		arr = new int[N];
		
		dfs(N, 0);
		
		br.close();
		bw.close();
	}
	
	public static void dfs(int n, int idx) throws IOException {
		if(idx >= n) {
			for(int i : arr) {
				bw.write(i + " ");
			}
			bw.newLine();
		}
		else {
			for(int i=1; i<isVisit.length; i++) {
				if(!isVisit[i]) {
					arr[idx] = i;
					isVisit[i] = true;
					dfs(n, idx+1);
					isVisit[i] = false;
				}
			}
		}
	}
	
}
