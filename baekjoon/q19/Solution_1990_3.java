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
	 * ���� �� ���̰� ¦���� �Ӹ������  ��� 11�� ���μ��� ������ ������ �Ҽ��� �ƴϴ�.
	 * ��, 11�� �ڱ��ڽ��� �Ҽ��̱� ������ �����̴�.
	 * ���� 11�� ������ ���� ��, ���̰� Ȧ���� ��� ���� ���ϸ� �ȴ�.
	 * 
	 * ex)
	 * ABCDDCBA ����
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
			// ������ ���̰� ¦���� ��� 11 ����ó���� ���ְ�, �׿ܿ��� �ڸ����� �÷��ش�.
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
