package my.level11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Solution_2504 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write(cal(br.readLine()));
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static int cal(String str) {
		int point = 0;
		char[] arr = str.toCharArray();
		
		Stack<Character> s1 = new Stack<Character>();
		Stack<Point> s2 = new Stack<Point>();
		
		int level = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == '(') {
				s1.push(arr[i]);
				s2.push(new Point(2, ++level));
			}
			else if(arr[i] == '[') {
				s1.push(arr[i]);
				s2.push(new Point(3, ++level));
			}
			else if(arr[i] == ')') {
				
				while(s2.peek().level >= level) {
					
				}
				
				
			}
			else if(arr[i] == ']') {
	
			}
		}
		
		
		
		
		return s2.isEmpty() ? 0 : point;
	}
	
	public static class Point {
		int point;
		int level;
		
		public Point(int point, int level) {
			this.point = point;
			this.level = level;
		}
	}
}
