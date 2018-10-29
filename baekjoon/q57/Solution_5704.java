package my.baekjoon.q57;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_5704 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String line = br.readLine();
			if(line.equals("*")) break;
			
			int[] alp = new int[26];
			
			for(int i=0; i<line.length(); i++) {
				if('a' <= line.charAt(i) && line.charAt(i) <= 'z') {
					alp[line.charAt(i)-'a']++;
				}
			}
			
			boolean isPangram = true;
			for(int i : alp) {
				if(i < 1) {
					isPangram = false;
					break;
				}
			}
			
			bw.write((isPangram) ? "Y" : "N");
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
}
