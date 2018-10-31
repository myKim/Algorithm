package my.baekjoon.q55;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_5575 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = 3;
		while(N-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int sTime = 0, eTime = 0, wTime;
			
			sTime += Integer.parseInt(st.nextToken()) * 60 * 60;
			sTime += Integer.parseInt(st.nextToken()) * 60;
			sTime += Integer.parseInt(st.nextToken());
			
			eTime += Integer.parseInt(st.nextToken()) * 60 * 60;
			eTime += Integer.parseInt(st.nextToken()) * 60;
			eTime += Integer.parseInt(st.nextToken());
			
			wTime = eTime - sTime;
			
			int h = wTime / 60 / 60;
			int m = (wTime / 60) % 60;
			int s = wTime % 60;
			
			System.out.println(h + " " + m + " " + s);
		}
		
		br.close();
	}
	
}