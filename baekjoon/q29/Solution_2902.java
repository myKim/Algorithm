package my.baekjoon.q29;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_2902 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		char[] arr = br.readLine().toCharArray();
		for(int i=0; i<arr.length; i++) {
			if(i==0 || arr[i-1]=='-') {
				bw.write(arr[i]);
			}
		}
		
		br.close();
		bw.close();
	}
	
}