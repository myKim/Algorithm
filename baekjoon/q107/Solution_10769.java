package my.baekjoon.q107;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_10769 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		
		bw.write(checkMood(str));
		
		br.close();
		bw.close();
	}
	
	public static String checkMood(String str) {
		char[] arr = str.toCharArray();
		
		int h = 0;
		int s = 0;
		
		for(int i=2; i<arr.length; i++) {
			if(arr[i-2]==':' && arr[i-1]=='-') {
				if(arr[i]==')') {
					h++;
				}
				else if(arr[i]=='(') {
					s++;
				}
			}
		}
		
		if(h > s)
			return "happy";
		else if(h < s)
			return "sad";
		else
			if(h == 0)
				return "none";
			else
				return "unsure";
	}
	
}
