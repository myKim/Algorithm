package my.baekjoon.q46;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_4613 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String line = null;
		while(!(line = br.readLine()).equals("#")) {
			bw.write(String.valueOf(quicksum(line)));
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
	private static int quicksum(String line) {
		int sum = 0;
		char[] arr = line.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			if('A'<=arr[i] && arr[i]<='Z') {
				sum += (i+1)*(arr[i]-'A'+1);
			}
		}
		
		return sum;
	}

}
