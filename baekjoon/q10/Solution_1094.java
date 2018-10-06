package my.baekjoon.q10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_1094 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int X = Integer.parseInt(br.readLine());
		int sum = 0;
		int min = 64;
		int cnt = 0;
		
		if(min > X) {
			while(true) {
				if(sum == X) {
					break;
				}
				
				min /= 2;
				
				if(sum + min <= X) {
					sum += min;
					cnt++;
				}
			}
		}
		else {
			cnt = 1;
		}
		
		bw.write(String.valueOf(cnt));
		
		bw.flush();
		bw.close();
		br.close();
	}
	
}
