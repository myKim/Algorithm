package my.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_10989 {

	public static void main(String[] args) throws IOException {
		
		int number = 0;
		int[] array;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		number = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		array = new int[10001];
		
		for(int i=0; i<number; i++) {
			st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				array[Integer.parseInt(st.nextToken())]++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i]; j++) {
				sb.append(i);
				sb.append("\n");
			}
		}
		System.out.println(sb.toString());
	}
}
