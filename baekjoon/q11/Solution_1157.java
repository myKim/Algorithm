package my.baekjoon.q11;

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
		
		String str = br.readLine().toUpperCase();  // 모두 대문자로 변환
		
		// 2. Solution
		int[] alphabet = new int[26];
		Arrays.fill(alphabet, 0);
		
		// 글자별 사용 개수 취득
		int max = 0;
		for(int i=0; i<str.length(); i++) {
			int index = str.charAt(i)-'A';
			alphabet[index]++;
			if(alphabet[max] < alphabet[index]) {
				max = index;  // 최대값 취득
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
