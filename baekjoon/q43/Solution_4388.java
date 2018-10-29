package my.baekjoon.q43;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_4388 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String A = st.nextToken();
			String B = st.nextToken();
			
			if(A.equals("0") && B.equals("0")) break;
			
			bw.write(String.valueOf(solution(A, B)));
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
	public static int solution(String A, String B) {
		char[] arrA = new StringBuilder(A).reverse().toString().toCharArray();
		char[] arrB = new StringBuilder(B).reverse().toString().toCharArray();
		
		int maxLen = Math.max(arrA.length, arrB.length);
		int carry = 0;
		int count = 0;
		
		for(int i=0; i<maxLen; i++) {
			int a = (i<arrA.length) ? arrA[i]-'0' : 0;
			int b = (i<arrB.length) ? arrB[i]-'0' : 0;
			
			carry = (a + b + carry) / 10;
			
			if(carry > 0) {
				count++;
			}
		}
		
		return count;
	}

}
