package my.level19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_1021 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		// 1. Input
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[M]; 
		for(int i=0; i<M; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// 2. Solution
		CustomQueue q = new CustomQueue(N);
		int cnt = 0;
		
		for(int i=0; i<arr.length; i++) {
			cnt += q.popValue(arr[i]);
		}
		
		bw.write(String.valueOf(cnt));
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static class CustomQueue {
		int[] q;
		int size;
		int firstIdx;
		
		public CustomQueue(int N) {
			init(N);
		}
		
		private void init(int N) {
			this.q = new int[N];
			
			for(int i=0; i<N; i++) {
				q[i] = i+1;
			}
			size = q.length;
			firstIdx = 0;
		}
		
		public int pop() {
			int v = -1;
			
			if(size > 0) {
				v = q[firstIdx];
				q[firstIdx++] = -1;
				size--;
			}
			return v;
		}
		
		private void move(int dir) {
			if(dir == 0) return;
			
			int[] tmpArr = q.clone();
			
			for(int i=firstIdx; i<firstIdx+size; i++) {
				this.q[firstIdx + ((i - firstIdx + dir + size) % size)] = tmpArr[i];
			}
		}
		
		// 해당 값을 Queue에서 뺀 후, 이동횟수 리턴
		public int popValue(int v) {			
			int dir = 0;
			int targetIdx = -1;
			
			for(int i=firstIdx; i<firstIdx+size; i++) {
				if(q[i] == v) {
					targetIdx = i;
					break;
				}
			}
			
			if(targetIdx < 0) {
				return -1;
			}
			
			dir = (targetIdx - firstIdx) > (size / 2) ? size+firstIdx-targetIdx : firstIdx-targetIdx; 
			move(dir);
			pop();
			
			return Math.abs(dir);
		}
	}
}
