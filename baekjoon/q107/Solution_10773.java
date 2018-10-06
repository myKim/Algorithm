package my.baekjoon.q107;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Solution_10773 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int K = Integer.parseInt(br.readLine());
		
		Stack<Integer> s = new Stack<>();
		while(K-- > 0) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0 && !s.isEmpty()) {
				s.pop();
			}
			else {
				s.push(n);
			}
		}
		
		int sum = 0;
		while(!s.isEmpty()) {
			sum += s.pop();
		}
		
		bw.write(String.valueOf(sum));
		bw.newLine();
		
		br.close();
		bw.close();
	}
	
}
