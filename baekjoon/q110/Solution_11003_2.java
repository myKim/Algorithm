package my.baekjoon.q110;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Solution_11003_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Deque<Pair> dq = new LinkedList<Pair>();
		
		for(int i=0; i<arr.length; i++) {
			while(!dq.isEmpty() && dq.peekFirst().i <= i-L) {
				dq.pollFirst();
			}
			while(!dq.isEmpty() && dq.peekLast().v > arr[i]) {
				dq.pollLast();
			}
			dq.addLast(new Pair(i, arr[i]));
			bw.write(String.valueOf(dq.peekFirst().v) + " ");
		}
		
		br.close();
		bw.close();
	}
	
	public static class Pair {
		int i;
		int v;
		public Pair(int i, int v) {
			this.i = i;
			this.v = v;
		}
	}

}
