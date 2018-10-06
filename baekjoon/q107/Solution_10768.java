package my.baekjoon.q107;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_10768 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int mon = Integer.parseInt(br.readLine());
		int day = Integer.parseInt(br.readLine());
		
		bw.write(checkDay(mon, day));
		
		br.close();
		bw.close();
	}
	
	public static String checkDay(int mon, int day) {
		if(mon > 2) {
			return "After";
		}
		else if(mon < 2) {
			return "Before";
		}
		else {
			if(day > 18) {
				return "After";
			}
			else if(day < 18) {
				return "Before";
			}
			else {
				return "Special";
			}
		}
	}
	
}
