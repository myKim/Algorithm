package my.baekjoon.q108;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_10845 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		MyQueue q = new MyQueue();
		
		int N = Integer.parseInt(br.readLine());
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			switch(st.nextToken()) {
			case "push":
				int value = Integer.parseInt(st.nextToken());
				q.push(value);
				break;
			case "pop":
				bw.write(String.valueOf(q.pop()));
				bw.newLine();
				break;
			case "size":
				bw.write(String.valueOf(q.size()));
				bw.newLine();
				break;
			case "empty":
				bw.write(String.valueOf(q.isEmpty()));
				bw.newLine();
				break;
			case "front":
				bw.write(String.valueOf(q.front()));
				bw.newLine();
				break;
			case "back":
				bw.write(String.valueOf(q.back()));
				bw.newLine();
				break;
			}
		}
		
		br.close();
		bw.close();
	}
	
	
	public static class MyQueue {
		private int[] q;
		private int front;
		private int size;
		
		public MyQueue() {
			this.q = new int[50];
			this.front = 0;
			this.size = 0;
		}
		
		// Queue 배열 사이즈를 2배로 늘린다.
		private void extendSize() {
			int[] tmp = new int[q.length * 2];
			
			for(int i=0; i<q.length; i++) {
				tmp[i] = q[(front + i) % q.length];
			}
			q = tmp;
			front = 0;
		}
		
		private int pop() {
			if(size <= 0) {
				return -1;
			}
			int res = q[front];
			front = (front + 1) % q.length;
			size--;
			
			return res;
		}
		
		public void push(int input) {
			// 배열이 가득 찼을 경우에 배열을 확장한다.
			if(size >= q.length) {
				extendSize();
			}
			q[(front + size++) % q.length] = input;
		}
		
		public int size() {
			return size;
		}
		
		public int isEmpty() {
			return (size <= 0) ? 1 : 0;
		}
		
		public int front() {
			return (size > 0) ? q[front] : -1;
		}
		
		public int back() {
			return (size > 0) ? q[(front + size - 1) % q.length] : -1;
		}
	}
	
}
