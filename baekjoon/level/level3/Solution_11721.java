package my.level3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_11721 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char[] input = br.readLine().toCharArray();
		
		for(int i=0; i<input.length; i++) {
			bw.write(input[i]);
			if(i % 10 == 9) {
				bw.write("\n");
			}
		}		
		
		br.close();
		bw.close();
	}

}
