package my.baekjoon.q102;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_10219 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			
			String[] grill = new String[H];
			for(int i=0; i<H; i++) {
				grill[i] = br.readLine();
			}
			
			for(int i=grill.length-1; i>=0; i--) {
				bw.write(grill[i]);
				bw.newLine();
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
