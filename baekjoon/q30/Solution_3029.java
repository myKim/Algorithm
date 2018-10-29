package my.baekjoon.q30;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_3029 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = null;
		
		int curTime = 0, tarTime = 0;
		
		st = new StringTokenizer(br.readLine(), ": ");
		curTime += 60 * 60 * Integer.parseInt(st.nextToken());
		curTime += 60 * Integer.parseInt(st.nextToken());
		curTime += Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), ": ");
		tarTime += 60 * 60 * Integer.parseInt(st.nextToken());
		tarTime += 60 * Integer.parseInt(st.nextToken());
		tarTime += Integer.parseInt(st.nextToken());
		tarTime += 24 * 60 * 60;
		
		int resTime = tarTime - curTime;
		int s = resTime % 60;
		resTime /= 60;		
		int m = resTime % 60;
		resTime /= 60;
		int h = resTime % 24;
		
		if(h==0 && m==0 && s==0) {
			h = 24;
		}
		bw.write(String.format("%02d:%02d:%02d", h, m, s));
		
		bw.close();
		br.close();
	}
	
}