package my.level12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution_11866 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Queue<Integer> q = new LinkedList<>();
		for(int i=1; i<=N; i++) {
			q.offer(i);
		}
		
		// 정답 문자열 생성
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		while(!q.isEmpty()) {
			for(int i=0; i<M-1; i++) {
				q.offer(q.poll());  // M번째 값을 찾기 위해 M-1번 뺐다 넣었다를 반복
			}
			sb.append(String.valueOf(q.poll())).append(", ");
		}
		if(sb.substring(sb.length()-2, sb.length()).equals(", ")) { // 마지막 콤마 제거
			sb.delete(sb.length()-2, sb.length());
		}
		sb.append(">");
		
		bw.write(sb.toString());
		
		br.close();
		bw.close();
	}
	
}
