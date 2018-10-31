package my.baekjoon.q53;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_5361 {
	
	private static final float[] price = {350.34f, 230.90f, 190.55f, 125.30f, 180.90f};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		while(T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			float cost = 0;
			for(int i=0; i<price.length; i++) {
				cost += price[i] * Integer.parseInt(st.nextToken());
			}
			
			bw.write(String.format("$%.2f", cost));
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
}