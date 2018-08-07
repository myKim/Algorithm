package my.level9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Solution_1427_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char[] input = br.readLine().toCharArray();
		Arrays.sort(input);
		
		for(int i=input.length-1; i>=0; i--) {
			bw.write(input[i]);
		}
		
		br.close();
		bw.close();
	}
}
