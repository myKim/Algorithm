package my.baekjoon.q116;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Solution_11656 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		String[] arr = new String[str.length()];
		
		StringBuilder sb = new StringBuilder(str);
		for(int i=0; i<arr.length; i++) {
			arr[i] = sb.toString();
			sb.deleteCharAt(0);
		}
		Arrays.sort(arr);
		
		for(String s : arr) {
			bw.write(s + "\n");
		}
		
		br.close();
		bw.close();
	}
}
