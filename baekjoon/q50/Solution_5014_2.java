package my.baekjoon.q50;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution_5014_2 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int F = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int G = Integer.parseInt(st.nextToken());
		int U = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		
		int[] dir = {U, -D};
		int[] b = new int[F+1];
		Arrays.fill(b, -1);
		
		Queue<Integer> q = new LinkedList<>();
		q.offer(S);
		b[S] = 0;
		
		while(!q.isEmpty()) {
			int pos = q.poll();
			if(pos == G) {
				break;
			}
			
			for(int d : dir) {
				int nextPos = pos + d;
				if(isRange(b, nextPos) && b[nextPos] == -1) {
					q.offer(nextPos);
					b[nextPos] = b[pos] + 1;
				}
			}
		}
		
		bw.write((b[G] != -1) ? String.valueOf(b[G]) : "use the stairs");
		
		br.close();
		bw.close();
	}
	
	public static boolean isRange(int[] b, int x) {
		return (1<=x && x<b.length);
	}
	
}
