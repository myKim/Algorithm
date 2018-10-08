package my.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_1213 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String res = getPalindrome(str);
		
		System.out.println(res);
		
		br.close();
	}
	
	public static String getPalindrome(String str) {
		char[] p = new char[str.length()];
		
		int[] alpabet = new int[26];
		Arrays.fill(alpabet, 0);
		
		for(int i=0; i<str.length(); i++) {
			alpabet[str.charAt(i)-'A']++;
		}
		
		int oddIdx = -1;
		int oddCnt = 0;
		for(int i=0; i<alpabet.length; i++) {
			if((alpabet[i]&1) != 0) { // 홀수
				oddCnt++;
				oddIdx = i;
			}
		}
		if(oddCnt > 1) {
			return "I'm Sorry Hansoo";
		}
		
		int left = 0;
		int right = p.length-1;
		int aIdx = 0;
		
		// AAABB 입력의 경우 : ABABA 가 답이다.
		while(aIdx < alpabet.length) {
			while(aIdx<alpabet.length && alpabet[aIdx]<=1) {
				aIdx++;
			}
			if(aIdx >= alpabet.length) {
				break;
			}
			
			while(alpabet[aIdx] > 1) {
				p[left++] = (char) (aIdx + 'A');
				p[right--] = (char) (aIdx + 'A');
				alpabet[aIdx] -= 2;
			}
		}
		if(oddCnt > 0) {
			for(int i=0; i<alpabet[oddIdx]; i++) {
				p[left+i] = (char) (oddIdx + 'A');
			}
		}
		
		return String.valueOf(p);
	}
}
