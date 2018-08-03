package my.level7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Solution_1157 {

	public static void main(String[] args) throws IOException {
		// 1. Input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine().toUpperCase();
		
		// 2. Solution
		int[] alphabet = new int[26];
		Arrays.fill(alphabet, 0);
		
		// 글자별 사용 개수 취득
		for(int i=0; i<str.length(); i++) {
			alphabet[str.charAt(i)-'A']++;
		}
		
		// 최대값 인덱스 취득
		int max = 0;
		for(int i=0; i<alphabet.length; i++) {
			if(alphabet[i] > alphabet[max]) {
				max = i;
			}
		}
		char result = (char) ('A' + max);
		
		// 유일한 값인지 확인
		for(int i=0; i<alphabet.length; i++) {
			if(i != max && alphabet[i] == alphabet[max]) {
				result = '?';
				break;
			}
		}
		
		bw.write(result);
		
		br.close();
		bw.close();
	}
}
