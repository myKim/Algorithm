package my.baekjoon.q104;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_10451 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			int N = Integer.parseInt(br.readLine());
			int[] arr = new int[N+1];
			int[] visit = new int[N+1];
			Arrays.fill(visit, 0);
			
			st = new StringTokenizer(br.readLine());
			for(int i=1; i<arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			int group = 0;
			for(int i=1; i<arr.length; i++) {
				if(visit[i] == 0) { // 미방문 노드일 경우
					visit[i] = ++group;
					int idx = arr[i]; // 다음 노드
					while(idx != i) {
						visit[idx] = group;
						idx = arr[idx];
					}
				}
			}
			bw.write(String.valueOf(group));
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
}
