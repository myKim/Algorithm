package my.baekjoon.q49;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Solution_4949 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Stack<Character> s = new Stack<>();
		while(true) {
			char[] arr = br.readLine().toCharArray();
			if(arr.length == 1 && arr[0] == '.') break;
			
			boolean isBalance = true;
			
			for(int i=0; i<arr.length; i++) {
				if(arr[i] == '[' || arr[i] == '(') {
					s.push(arr[i]);
				}
				else if(arr[i] == ']') {
					if(s.isEmpty() || s.pop() != '[') {
						isBalance = false;
						break;
					}
				}
				else if(arr[i] == ')') {
					if(s.isEmpty() || s.pop() != '(') {
						isBalance = false;
						break;
					}
				}
			}
			
			if(s.isEmpty() && isBalance) {
				bw.write("yes");
			}
			else {
				bw.write("no");
			}
			bw.newLine();
			s.clear();
		}
		
		br.close();
		bw.close();
	}
	
}