package my.baekjoon.q53;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_5397_3 {
	/*************
	 * 시간초과 오답 *
	 *************/
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
		
		StringBuilder sb = new StringBuilder();
		int pos = 0;
		for(int i=0; i<arr.length; i++) {
			switch(arr[i]) {
				case '<':
					if(pos > 1) pos--;
					break;
				case '>':
					if(pos < sb.length()) pos++;
					break;
				case '-':
					if(pos > 1) {
						sb.deleteCharAt(--pos); // delete 연산에서 시간이 많이 소요될 것이라 생각됨
					}
					break;
				default:
					sb.insert(pos++, arr[i]); // insert 연산에서 시간이 많이 소요될 것이라 생각됨
					break;
			}
		}
		return sb.toString();
	}
	
}