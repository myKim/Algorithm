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
					return pri2 - pri1;  // �߿䵵 �������� ����
				}
			});
			
			st = new StringTokenizer(br.readLine());
			for(int i=0; i<N; i++) {
				int pri = Integer.parseInt(st.nextToken());
				
				q.offer(new Document(i, pri));  // ���� ������ �Ϲ� ť�� ����
				pq.offer(pri);  // �߿䵵�� �켱����ť�� ����
			}
			
			// Solution
			int cnt = 0;
			while(!q.isEmpty()) {
				Document doc = q.poll();
				
				if(doc.pri < pq.peek()) {  // ť ���ο� �ڱ⺸�� �߿䵵�� ���� ������ ���� ���
					q.offer(doc);  // �ٽ� ť�� �ִ´�.
				}
				else {
					pq.poll();  // �μ������Ƿ� �ش� �߿䵵 poll
					cnt++;
					
					if(doc.idx == M) {  // ��� �μ��� ������ ���ΰ�� break;
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
		int idx;  // ���� ��ġ
		int pri;  // �߿䵵
		
		public Document(int i, int p) {
			this.idx = i;
			this.pri = p;
		}
	}
}
