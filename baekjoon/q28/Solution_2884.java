package my.baekjoon.q28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_2884 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int min = (60*H) + M + (24*60) - 45;
		
		int resH = (min / 60) % 24;
		int resM = min % 60;
		
		System.out.println(resH + " " + resM);
		
		br.close();
	}
	
}
