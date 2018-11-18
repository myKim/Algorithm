package my.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_11655 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String res = rot13(str);
		
		System.out.println(res);
		
		br.close();
	}
	
	public static String rot13(String str) {
		char[] arr = str.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			char fc;
			
			if('a'<=arr[i] && arr[i]<='z') {
				fc = 'a';
			}
			else if('A'<=arr[i] && arr[i]<='Z') {
				fc = 'A';
			}
			else {
				continue;
			}
			arr[i] = (char) (fc + ((arr[i]-fc + 13) % 26));
		}
		
		return String.valueOf(arr);
	}
}
