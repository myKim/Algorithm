package my.baekjoon.q27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_2753 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int year = Integer.parseInt(br.readLine());
		System.out.println(isYoon(year) ? 1 : 0);
		
		br.close();
	}

	public static boolean isYoon(int year) {
		return (year%4 == 0) && ((year%100 != 0) || (year%400 == 0));
	}
}
