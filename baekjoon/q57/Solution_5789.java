package my.baekjoon.q57;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_5789 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		while(N-- > 0) {
			char[] arr = br.readLine().toCharArray();
			int len = arr.length;
			
			boolean isDo = false;
			if(arr[len/2-1] == arr[len/2]) {
				isDo = true;
			}
			
			bw.write((isDo) ? "Do-it" : "Do-it-Not");
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
}
