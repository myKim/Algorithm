package my.baekjoon.q50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution_5014_1 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int F = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int G = Integer.parseInt(st.nextToken());
		int U = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		br.close();
		
		int pos = 0;
		int[] cnt = new int[F+1];
		Arrays.fill(cnt, -1);
		
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(S);
		cnt[S] = 0;
		
		while(!queue.isEmpty()) {
			pos = queue.poll();
			
			if(pos == G) {
				break;
			}
			if(pos + U <= F && cnt[pos + U] == -1) {
				queue.add(pos + U);
				cnt[pos + U] = cnt[pos] + 1;
			}
			if(pos - D >= 1 && cnt[pos - D] == -1) {
				queue.add(pos - D);
				cnt[pos - D] = cnt[pos] + 1;
			}
		}
		
		if(pos == G) {
			System.out.println(cnt[pos]);
		}
		else {
			System.out.println("use the stairs");
		}
	}
}
