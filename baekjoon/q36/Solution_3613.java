package my.baekjoon.q36;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_3613 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		if(isJava(str)) {
			System.out.println(convertJtoC(str));
		}
		else if(isC(str)) {
			System.out.println(convertCtoJ(str));
		}
		else {
			System.out.print("Error!");
		}
		
		br.close();
	}
	
	public static String convertCtoJ(String str) {
		char[] arr = str.toCharArray();
		StringBuilder sb = new StringBuilder();

		for(int i=0; i<arr.length; i++) {
			if(arr[i]=='_') {
				sb.append(Character.toUpperCase(arr[++i]));
			}
			else {
				sb.append(arr[i]);
			}
		}
		
		return sb.toString();		
	}
	
	public static String convertJtoC(String str) {
		char[] arr = str.toCharArray();
		StringBuilder sb = new StringBuilder();

		for(int i=0; i<arr.length; i++) {
			if('A'<=arr[i] && arr[i]<='Z') {
				sb.append('_').append(Character.toLowerCase(arr[i]));
			}
			else {
				sb.append(arr[i]);
			}
		}
		
		return sb.toString();
	}
		
	public static boolean isJava(String str) {
		char[] arr = str.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			if(i==0) {
				if(arr[i]<'a' || 'z'<arr[i]) {
					return false;
				}
			}
			if((arr[i]<'a' || 'z'<arr[i]) && (arr[i]<'A' || 'Z'<arr[i])) {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean isC(String str) {
		char[] arr = str.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			if((arr[i]<'a' || 'z'<arr[i]) && (arr[i]!='_')) {
				return false;
			}
			else {
				if(arr[i]=='_') {
					if(i==0) {
						return false;
					}
					if(i+1 >= arr.length || (arr[i+1]<'a' || 'z'<arr[i+1])) {
						return false;
					}
				}
			}
		}
		
		return true;
	}
	
}
