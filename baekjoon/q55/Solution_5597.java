package my.baekjoon.q55;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_5597 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean[] rep = new boolean[30+1];
		Arrays.fill(rep, false);
		
		for(int i=0; i<28; i++) {
			rep[Integer.parseInt(br.readLine())] = true;
		}
		
		for(int i=1; i<rep.length; i++) {
			if(!rep[i]) {
				System.out.println(i);
			}
		}
		
		br.close();
	}
	
}