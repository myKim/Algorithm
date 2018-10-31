package my.baekjoon.q53;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Solution_5397_2 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		while(T-- > 0) {
			String res = getPassword(br.readLine());
			
			bw.write(res);
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
	public static String getPassword(String str) {
		char[] arr = str.toCharArray();
		
		// 둘다 스택을 사용했을 때가 더 빠름
		Deque<Character> st1 = new LinkedList<>();
		Stack<Character> st2 = new Stack<>();
		
		for(char c : arr) {
			switch(c) {
				case '<':
					if(!st1.isEmpty()) {
						st2.push(st1.pop());
					}
					break;
				case '>':
					if(!st2.isEmpty()) {
						st1.push(st2.pop());
					}
					break;
				case '-':
					if(!st1.isEmpty()) {
						st1.pop();
					}
					break;
				default:
					st1.push(c);
					break;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		while(!st1.isEmpty()) {
			sb.append(st1.pollLast());
		}
		while(!st2.isEmpty()) {
			sb.append(st2.pop());
		}
		
		return sb.toString();
	}
	
}