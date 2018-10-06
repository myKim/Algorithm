package my.baekjoon.q14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Solution_1475 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char[] N = br.readLine().toCharArray();
		
		int[] array = new int[10];
		Arrays.fill(array, 0);
		
		for(int i=0; i<N.length; i++) {
			int num = N[i]-'0';
			if(num == 9) num = 6;  
			array[num]++;
		}
		array[6] = (array[6] + 1) / 2;
		
		int max = 0;
		for(int i=0; i<array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		bw.write(String.valueOf(max));
		
		br.close();
		bw.close();
	}
}
