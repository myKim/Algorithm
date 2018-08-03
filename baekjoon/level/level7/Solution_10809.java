package my.level7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Solution_10809 {

	public static void main(String[] args) throws IOException {
		// 1. Input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char[] str = br.readLine().toCharArray();
		
		// 2. Solution
		int[] alphabet = new int[26];
		Arrays.fill(alphabet, -1);
		
		for(int i=0; i<str.length; i++) {
			int idx = str[i]-'a';
			if(alphabet[idx] == -1) {
				alphabet[idx] = i;
			}
		}
		
		// 3. Output
		for(int i=0; i<alphabet.length; i++) {
			bw.write(String.valueOf(alphabet[i]));
			bw.write(" ");
		}
		
		br.close();
		bw.close();
	}
}
