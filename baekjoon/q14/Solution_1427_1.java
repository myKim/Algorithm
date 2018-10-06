package my.baekjoon.q14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Solution_1427_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		char[] input = br.readLine().toCharArray();
		Integer[] list = new Integer[input.length];
		
		for(int i=0; i<input.length; i++) {
			list[i] = input[i]-'0';
		}
		
		Arrays.sort(list, new ReverseComparator());
		
		for(int a : list) {
			bw.write(String.valueOf(a));
		}
		
		br.close();
		bw.close();
	}
	
	static class ReverseComparator implements Comparator<Integer> {
		@Override
		public int compare(Integer o1, Integer o2) {
			return o2 - o1;
		}
	}
}
