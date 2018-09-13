package my.etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_10757 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		String a = st.nextToken();
		String b = st.nextToken();
		
		bw.write(sum(a, b));
		
		br.close();
		bw.close();
	}
	
	public static String sum(String a, String b) {
		int len = a.length() > b.length() ? a.length() : b.length();  // �� ���߿� �� ���� ��� 
		
		int[] arr1 = new int[len];  // ù���� �� �迭
		int[] arr2 = new int[len];  // �ι�° �� �迭
		int[] sum = new int[len+1];  // ��� �迭
		Arrays.fill(arr1, 0);
		Arrays.fill(arr2, 0);
		Arrays.fill(sum, 0);
		
		for(int i=0; i<a.length(); i++) {  // ���ڿ��� �ѱ��ھ��� ���� �迭�� ��ȯ
			arr1[i] = a.charAt(a.length()-1-i) - '0';
		}
		for(int i=0; i<b.length(); i++) {
			arr2[i] = b.charAt(b.length()-1-i) - '0';
		}
		
		for(int i=0; i<len; i++) {
			int tmp = (sum[i] + arr1[i] + arr2[i]);
			sum[i] = tmp % 10;  // ���� �ڸ� ���
			sum[i+1] = tmp / 10;  // �ڸ��ø�(carry) ���
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i : sum) {
			sb.append(String.valueOf(i));
		}
		if(sb.charAt(sb.length()-1) == '0') {  // ������ ù���ڰ� 0�� ��� �����ش�.
			sb.deleteCharAt(sb.length()-1);
		}
		
		return sb.reverse().toString();
	}
}
