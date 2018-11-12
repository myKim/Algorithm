package my.baekjoon.q108;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_10808 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char[] arr = br.readLine().toCharArray();
		int[] cnt = new int[26];
		
		for(char c : arr) {
			cnt[c-'a']++;
		}
		
		for(int i : cnt) {
			bw.write(i + " ");
		}
		
		br.close();
		bw.close();
	}
	
}
