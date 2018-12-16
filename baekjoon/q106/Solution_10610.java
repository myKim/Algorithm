package my.baekjoon.q106;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Solution_10610 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine();
		
		System.out.print(solution(input));
		
		br.close();
		bw.close();
	}
	
	public static String solution(String input) {
		char[] arr = input.toCharArray();
		Arrays.sort(arr);
		
		if(arr[0] != '0') {
			return "-1";
		}
		
		int sum = 0;
		for(char c : arr) {
			sum += (c-'0');
		}
		
		if((sum % 3) != 0) {
			return "-1";
		}
		
		return new StringBuilder(String.valueOf(arr)).reverse().toString();
	}

}