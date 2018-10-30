package my.baekjoon.q27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_2789_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		System.out.println(str.replaceAll("[CAMBRIDGE]", ""));
		
		br.close();
	}

}
