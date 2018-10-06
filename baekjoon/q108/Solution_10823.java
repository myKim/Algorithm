package my.baekjoon.q108;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_10823 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int sum = 0;
		int num = 0;
		int c;
		while((c = br.read()) != -1) {
			if(c == '\n') continue;
			
			if('0'<=c && c<='9') {
				num = num*10 + (c-'0');
			}
			else {
				sum += num;
				num = 0;
			}
		}
		sum += num;
		
		bw.write(String.valueOf(sum));
		
		br.close();
		bw.close();
	}
	
}