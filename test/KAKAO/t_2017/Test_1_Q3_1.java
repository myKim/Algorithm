package my.kakao.t_2017;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Test_1_Q3_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 캐시 사이즈 입력
		int cacheSize = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), "[ ,\"]“”");
		City[] cities = new City[st.countTokens()];
		
		// 도시 입력
		int cnt = st.countTokens();
		for(int i=0; i<cnt; i++) {
			String name = st.nextToken();
			cities[i] = new City(name);
		}
		
		// Solution
		LRU lru = new LRU(cacheSize);
		
		int time = 0;
		for(City c : cities) {
			time += lru.add(c);
		}
		
		bw.write(String.valueOf(time));
		
		br.close();
		bw.close();
	}
	
	public static class LRU {
		PriorityQueue<City> pq;
		final int cacheSize;
		
		public LRU(int cacheSize) {
			this.pq = new PriorityQueue<>();
			this.cacheSize = cacheSize;
		}
		
		public int add(City c) {
			int time = 0;
			boolean hitFlag = false;
			
			Queue<City> q = new LinkedList<>();
			while(!pq.isEmpty()) {
				City tmp = pq.poll();
				
				if(tmp.equals(c)) {
					hitFlag = true;
					tmp.age = 0;  // 히트 시 age 초기화
				}
				tmp.age++;
				q.offer(tmp);
			}
			while(!q.isEmpty()) {
				pq.offer(q.poll());
			}
			
			if(hitFlag) { // cache hit
				time += 1;
			}
			else { // cache miss
				if(pq.size() >= cacheSize) {
					pq.poll();
				}
				pq.offer(c);
				time += 5;
			}
			
			return time;
		}
	}
	
	public static class City implements Comparable<City> {
		String name;
		int age;
		
		public City(String name) {
			this.age = 0;
			this.name = name;
		}
		
		@Override
		public int compareTo(City c) {
			return c.age - this.age; // 내림차순 정렬
		}

		@Override
		public boolean equals(Object o) {
			return this.name.equals(((City) o).name);
		}

		@Override
		public String toString() {
			return "[" + name + " " + age + "]";
		}
	}
}
