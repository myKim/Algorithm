package my.level6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_2920 {

	public static void main(String[] args) throws IOException {
		// 1. Input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] array = new int[8];
		for(int i=0; i<8; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		// 2. Solution
		bw.write(checkFunc(array));
		
		br.close();
		bw.close();
	}
	
	public static String checkFunc(int[] array) {
		boolean isAsc = true;
		for(int i=0; i<array.length-1; i++) {
			if(array[i] > array[i+1]) {
				isAsc = false;
				break;
			}
		}
		if(isAsc) return "ascending";
		
		boolean isDesc = true;
		for(int i=0; i<array.length-1; i++) {
			if(array[i] < array[i+1]) {
				isDesc = false;
				break;
			}
		}
		if(isDesc) return "descending";
		
		return "mixed";
	}
}
