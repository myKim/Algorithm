package my.baekjoon.q19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1990_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		boolean[] soe = sieveOfEratosthenes(b);
		
		for(int i=a; i<=b; i++) {
			if(soe[i] && isPalin(i)) {
				bw.write(String.valueOf(i));
				bw.newLine();
			}
		}
		bw.write("-1");
		
		br.close();
		bw.close();
	}
	
	public static boolean isPalin(int n) {
		String str = String.valueOf(n);
		
		for(int i=0; i<str.length()/2; i++) {
			if(str.charAt(i) != str.charAt(str.length()-1-i)) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean[] sieveOfEratosthenes(int max) {
		boolean[] soe = new boolean[max+1];
		Arrays.fill(soe, true);
		soe[0] = false;
		soe[1] = false;
		
		int prime = 2;
		int size = (int) Math.sqrt(max);
		
		while(prime <= size) {
			if(soe[prime]) {
				for(int i=prime*prime; i<=max; i+=prime) {
					soe[i] = false;
				}
			}
			prime++;
		}
		return soe;
	}
	
}
