package my.baekjoon.q109;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_10987 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char[] array = br.readLine().toCharArray();
		int cnt = 0;
		for(char c : array) {
			switch(c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				cnt++;
			}
		}
		bw.write(String.valueOf(cnt));
		
		br.close();
		bw.close();
	}
}
