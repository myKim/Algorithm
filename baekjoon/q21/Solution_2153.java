package my.baekjoon.q21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_2153 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		char[] word = br.readLine().toCharArray();
		
		int value = 0;
		for(int i=0; i<word.length; i++) {
			if('a' <= word[i] && word[i] <= 'z') {
				value += (word[i] - 'a' + 1);
			}
			else {
				value += (word[i] - 'A' + 27);
			}
		}
		
		if(isPrime(value)) {
			bw.write("It is a prime word.");
		}
		else {
			bw.write("It is not a prime word.");
		}
		
		br.close();
		bw.close();
	}
	
	public static boolean isPrime(int x) {
		int leng = (int) Math.sqrt(x);
		for(int i=2; i<= leng; i++) {
			if(x % i == 0) {
				return false;
			}
		}
		return true;
	}
}