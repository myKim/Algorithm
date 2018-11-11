package my.baekjoon.q65;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_6502 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int p = 0;
		String line = null;
		while(!(line = br.readLine().trim()).equals("0")) {
			StringTokenizer st = new StringTokenizer(line);
			
			int r = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int l = Integer.parseInt(st.nextToken());
			
			int a = (2*r) * (2*r);
			int b = w*w + l*l;
			
			if(a>=b) {
				bw.write("Pizza "+ ++p + " fits on the table.");
			}
			else {
				bw.write("Pizza "+ ++p + " does not fit on the table.");
			}
			bw.newLine();
		}
		
		bw.close();
		br.close();
	}
	
}
