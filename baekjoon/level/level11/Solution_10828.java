package my.level11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_10828 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		MyStack s = new MyStack();
		
		int N = Integer.parseInt(br.readLine());
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			switch(st.nextToken()) {
			case "push":
				s.push(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				bw.write(String.valueOf(s.pop()));
				bw.newLine();
				break;
			case "size":
				bw.write(String.valueOf(s.size()));
				bw.newLine();
				break;
			case "empty":
				bw.write(String.valueOf(s.isEmpty()));
				bw.newLine();
				break;
			case "top":
				bw.write(String.valueOf(s.top()));
				bw.newLine();
				break;
			}
		}
		
		br.close();
		bw.close();
	}
	
	
	public static class MyStack {
		private int[] s;
		private int top;
		private int size;
		
		public MyStack() {
			this.s = new int[50];
			this.top = -1;
			this.size = 0;
		}
		
		private void extendSize() {
			int[] tmp = new int[s.length * 2];
			
			for(int i=0; i<s.length; i++) {
				tmp[i] = s[i];
			}
			s = tmp;
		}
		
		public void push(int input) {
			// 배열이 가득 찼을 경우 배열을 확장한다.
			if(size >= s.length) {
				extendSize();
			}
			s[++top] = input;
			size++;
		}
		
		public int pop() {
			if(size > 0) {
				size--;
				return s[top--];
			}
			return -1;
		}
		
		public int size() {
			return size;
		}
		
		public int isEmpty() {
			return (size <= 0) ? 1 : 0;
		}
		
		public int top() {
			return (top >= 0) ? s[top] : -1;
		}
	}
}
