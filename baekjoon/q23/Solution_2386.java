package my.baekjoon.q23;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_2386 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String line = null;
		while(!(line = br.readLine()).equals("#")) {
			StringTokenizer st = new StringTokenizer(line);
			char target = st.nextToken().toLowerCase().charAt(0);
			
			int cnt = 0;
			while(st.hasMoreTokens()) {
				char[] arr = st.nextToken().toLowerCase().toCharArray();
				
				for(char c : arr) {
					if(c == target) cnt++; 
				}
			}
			
			bw.write(target + " " + cnt);
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
}
