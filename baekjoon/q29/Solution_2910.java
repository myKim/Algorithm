package my.baekjoon.q29;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Solution_2910 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
	
		ArrayList<Number> list = new ArrayList<>();
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			Number n = new Number(Integer.parseInt(st.nextToken()), i);
			
			int idx = list.indexOf(n);
			if(idx < 0) {
				list.add(n);
			}
			else {
				list.get(idx).cnt++;
			}
		}
		Collections.sort(list);
		
		for(int i=0; i<list.size(); i++) {
			Number number = list.get(i);
			for(int j=0; j<number.cnt; j++) {
				bw.write(number.toString() + " ");
			}
		}
		
		br.close();
		bw.close();
	}
	
	static class Number implements Comparable<Number> {
		int cnt;
		int firstIdx;
		int num;
		
		public Number(int num, int idx) {
			this.num = num;
			this.cnt = 1;
			this.firstIdx = idx;
		}
		
		@Override
		public boolean equals(Object obj) {
			return this.num == ((Number)obj).num;
		}

		@Override
		public int compareTo(Number n) {
			if(this.cnt > n.cnt) {
				return -1;
			}
			else if(this.cnt < n.cnt) {
				return 1;
			}
			else {
				if(this.firstIdx > n.firstIdx) {
					return 1;
				}
				else if(this.firstIdx < n.firstIdx) {
					return -1;
				}
				else {
					return 0;
				}
			}
		}

		@Override
		public String toString() {
			return String.valueOf(num);
		}
	}
	
}