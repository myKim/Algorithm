package my.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_1212 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char[] arr = br.readLine().toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			String octN = String.valueOf(arr[i]);
			String binN = Integer.toBinaryString(Integer.parseInt(octN, 8));
			
			if(i!=0) {
				StringBuilder sb = new StringBuilder();
				sb.append(binN);
				while(sb.length() < 3) {
					sb.insert(0, "0");
				}
				binN = sb.toString();
			}
			bw.write(binN);
			
		}
		
		br.close();
		bw.close();
	}
}
