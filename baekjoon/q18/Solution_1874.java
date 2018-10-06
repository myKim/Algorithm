package my.baekjoon.q18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Solution_1874 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		/*****************************************
		 * 1. Input
		 *****************************************/
		int n = Integer.parseInt(br.readLine());
		int[] input = new int[n];
		for(int i=0; i<n; i++) {
			input[i] = Integer.parseInt(br.readLine());
		}
		
		/*****************************************
		 * 2. Solution
		 *****************************************/
		Stack<Integer> s = new Stack<Integer>();
		StringBuffer sb = new StringBuffer();
		
		int i = 1;
		int j = 0;
		
		while(j < input.length) {
			if(s.isEmpty() || s.peek() < input[j]) {
				s.push(i++);
				sb.append("+\n");
			}
			else if(s.peek() == input[j]) {
				s.pop();
				j++;
				sb.append("-\n");
			}
			else {
				break;
			}
		}
		
		if(j < input.length) {
			bw.write("NO");
		}
		else {
			bw.write(sb.toString());
		}
		
		br.close();
		bw.close();
	}
}
