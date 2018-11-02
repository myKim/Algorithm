package my.baekjoon.q19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1990_3 {

	/************************************************************
	 * 수열 중 길이가 짝수인 팰린드롬은  모두 11을 소인수로 가지기 때문에 소수가 아니다.
	 * 단, 11은 자기자신이 소수이기 때문에 예외이다.
	 * 따라서 11을 제외한 수열 중, 길이가 홀수인 대상만 답을 구하면 된다.
	 * 
	 * ex)
	 * ABCDDCBA 형태
	 * 10000001 * 1    * A = (11) * 909091 * 1    * A 
	 * 100001   * 10   * B = (11) * 9091   * 10   * B
	 * 1001     * 100  * C = (11) * 91     * 100  * C
	 * 11       * 1000 * D = (11) * 1      * 1000 * D
	 ************************************************************/
	private static final int SOE_MAX_VALUE = 9_999_999;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		boolean[] soe = sieveOfEratosthenes(b);
		
		b = Math.min(b, SOE_MAX_VALUE);
		for(int i=a; i<=b; i++) {
			// 수열의 길이가 짝수일 경우 11 예외처리만 해주고, 그외에는 자리수를 올려준다.
			int len = String.valueOf(i).length();
			if((len & 1) == 0) {
				if(len == 2 && (a <= 11 && 11 <= b)) {
					bw.write("11");
					bw.newLine();
				}
				
				i = 1;
				while(len-- > 0) {
					i *= 10;
				}
				i -= 1;
				continue;
			}
			
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
		max = Math.min(max, SOE_MAX_VALUE);
		
		boolean[] soe = new boolean[max+1];
		Arrays.fill(soe, true);
		soe[0] = soe[1] = false;
		
		int size = (int) Math.sqrt(max);
		for(int prime = 2; prime <= size; prime++) {
			if(soe[prime]) {
				for(int i=prime*prime; i<=max; i+=prime) {
					soe[i] = false;
				}
			}
		}
		return soe;
	}
	
}
