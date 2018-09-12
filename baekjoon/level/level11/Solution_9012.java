package my.level11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Solution_9012 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			String str = br.readLine();
			
			bw.write(isVPS(str) ? "YES" : "NO");
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static boolean isVPS(String str) {
		Stack<Character> s = new Stack<Character>();
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == '(') {
				s.push(str.charAt(i));
			}
			else if(str.charAt(i) == ')') {
				if(s.isEmpty()) {
					return false;
				}
				else {
					s.pop();
				}
			}
		}
		return s.isEmpty() ? true : false;
	}
}
