package my.level12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution_1966 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		while(T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			Queue<Document> q = new LinkedList<>();
			PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
				@Override
				public int compare(Integer pri1, Integer pri2) {
					return pri2 - pri1;  // 중요도 내림차순 정렬
				}
			});
			
			st = new StringTokenizer(br.readLine());
			for(int i=0; i<N; i++) {
				int pri = Integer.parseInt(st.nextToken());
				
				q.offer(new Document(i, pri));  // 문서 정보를 일반 큐에 저장
				pq.offer(pri);  // 중요도를 우선순위큐에 저장
			}
			
			// Solution
			int cnt = 0;
			while(!q.isEmpty()) {
				Document doc = q.poll();
				
				if(doc.pri < pq.peek()) {  // 큐 내부에 자기보다 중요도가 높은 문서가 있을 경우
					q.offer(doc);  // 다시 큐에 넣는다.
				}
				else {
					pq.poll();  // 인쇄했으므로 해당 중요도 poll
					cnt++;
					
					if(doc.idx == M) {  // 방금 인쇄한 문서가 답인경우 break;
						break;
					}
				}
			}
			
			bw.write(String.valueOf(cnt));
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
	public static class Document {
		int idx;  // 문서 위치
		int pri;  // 중요도
		
		public Document(int i, int p) {
			this.idx = i;
			this.pri = p;
		}
	}
}
