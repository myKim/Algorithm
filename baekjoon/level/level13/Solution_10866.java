package my.level13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_10866 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		MyDeque dq = new MyDeque();
			
		int N = Integer.parseInt(br.readLine());
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			switch(st.nextToken()) {
			case "push_front":
				dq.pushFront(Integer.parseInt(st.nextToken()));
				break;
			case "push_back":
				dq.pushBack(Integer.parseInt(st.nextToken()));
				break;
			case "pop_front":
				bw.write(String.valueOf(dq.popFront()));
				bw.newLine();
				break;
			case "pop_back":
				bw.write(String.valueOf(dq.popBack()));
				bw.newLine();
				break;
			case "size":
				bw.write(String.valueOf(dq.size()));
				bw.newLine();
				break;
			case "empty":
				bw.write(String.valueOf(dq.isEmpty()));
				bw.newLine();
				break;
			case "front":
				bw.write(String.valueOf(dq.front()));
				bw.newLine();
				break;
			case "back":
				bw.write(String.valueOf(dq.back()));
				bw.newLine();
				break;
			}
		}
		
		br.close();
		bw.close();
	}
	
	
	public static class MyDeque {
		private int[] dq;
		private int front;
		private int size;
		
		public MyDeque() {
			this.dq = new int[50];
			this.front = 0;
			this.size = 0;
		}
		
		// Queue 배열 사이즈를 2배로 늘린다.
		private void extendSize() {
			int[] tmp = new int[dq.length * 2];
			
			for(int i=0; i<dq.length; i++) {
				tmp[i] = dq[(front + i) % dq.length];
			}
			dq = tmp;
			front = 0;
		}
		
		public void pushFront(int input) {
			// 배열이 가득 찼을 경우에 배열을 확장한다.
			if(size >= dq.length) {
				extendSize();
			}
			
			// 덱이 비어있지 않으면 현재 Front 보다 앞쪽에 추가 
			if(size > 0) {
				front = (front - 1 + dq.length) % dq.length;  // 현재 값보다 앞쪽에 추가
			}
			dq[front] = input;
			size++;
		}
		
		public void pushBack(int input) {
			// 배열이 가득 찼을 경우에 배열을 확장한다.
			if(size >= dq.length) {
				extendSize();
			}
			
			dq[(front + size) % dq.length] = input;
			size++;
		}
		
		private int popFront() {
			if(size <= 0) {
				return -1;
			}
			int res = dq[front];
			front = (front + 1) % dq.length;
			size--;
			
			return res;
		}
		
		private int popBack() {
			if(size <= 0) {
				return -1;
			}
			
			int res = dq[(front + size - 1) % dq.length];
			size--;
			
			return res;
		}
		
		public int size() {
			return size;
		}
		
		public int isEmpty() {
			return (size <= 0) ? 1 : 0;
		}
		
		public int front() {
			return (size > 0) ? dq[front] : -1;
		}
		
		public int back() {
			return (size > 0) ? dq[(front + size - 1) % dq.length] : -1;
		}
	}
	
}
