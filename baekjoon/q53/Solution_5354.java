package my.baekjoon.q53;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_5354 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		while(N-- > 0) {
			int size = Integer.parseInt(br.readLine());
			printBox(size, bw);
		}
		
		br.close();
		bw.close();
	}
	
	public static void printBox(int size, BufferedWriter bw) throws IOException {
		for(int i=1; i<=size; i++) {
			for(int j=1; j<=size; j++) {
				if((i==1) || (j==1) || (i==size) || (j==size)) {
					bw.write("#");
				}
				else {
					bw.write("J");
				}
			}
			bw.newLine();
		}
		bw.newLine();
	}
}