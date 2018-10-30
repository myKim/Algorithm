package my.baekjoon.q144;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_14405_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char[] arr = br.readLine().toCharArray();
		System.out.print(solution(arr) ? "YES" : "NO");
		
		br.close();
		bw.close();
	}
	
	public static boolean solution(char[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]=='p') {
				if((i+1 < arr.length) && arr[i+1]=='i') {
					i += 1;
				}
				else return false;
			}
			else if(arr[i] == 'k') {
				if((i+1 < arr.length) && arr[i+1]=='a') {
					i += 1;
				}
				else return false;
			}
			else if(arr[i] == 'c'){
				if((i+2 < arr.length) && arr[i+1]=='h' && arr[i+2]=='u') {
					i += 2;
				}
				else return false;
			}
			else return false;
		}
		return true;
	}
}