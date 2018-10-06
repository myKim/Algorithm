package my.baekjoon.q15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_1547 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int M = Integer.parseInt(st.nextToken());
		int[] table = new int[3];
		table[0] = 1;
		table[1] = 2;
		table[2] = 3;
		
		while(M-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(a != b) {
				int tmp = table[a-1];
				table[a-1] = table[b-1];
				table[b-1] = tmp;
			}
		}
		
		int result = -1;
		for(int i=0; i<table.length; i++) {
			if(table[i] == 1) {
				result = i+1;
			}
		}
		
		bw.write(String.valueOf(result));
		
		bw.flush();
		bw.close();
		br.close();
	}
	
}
