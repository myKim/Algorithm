package my.baekjoon.q159;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Solution_15915 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		Random ran = new Random();
		System.out.println(ran.nextInt(3));
		
		br.close();
	}
	
}