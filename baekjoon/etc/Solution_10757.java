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
		int len = a.length() > b.length() ? a.length() : b.length();  // 두 수중에 긴 길이 취득 
		
		int[] arr1 = new int[len];  // 첫번재 수 배열
		int[] arr2 = new int[len];  // 두번째 수 배열
		int[] sum = new int[len+1];  // 결과 배열
		Arrays.fill(arr1, 0);
		Arrays.fill(arr2, 0);
		Arrays.fill(sum, 0);
		
		for(int i=0; i<a.length(); i++) {  // 문자열을 한글자씩의 숫자 배열로 변환
			arr1[i] = a.charAt(a.length()-1-i) - '0';
		}
		for(int i=0; i<b.length(); i++) {
			arr2[i] = b.charAt(b.length()-1-i) - '0';
		}
		
		for(int i=0; i<len; i++) {
			int tmp = (sum[i] + arr1[i] + arr2[i]);
			sum[i] = tmp % 10;  // 현재 자리 계산
			sum[i+1] = tmp / 10;  // 자리올림(carry) 계산
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i : sum) {
			sb.append(String.valueOf(i));
		}
		if(sb.charAt(sb.length()-1) == '0') {  // 숫자의 첫글자가 0일 경우 지워준다.
			sb.deleteCharAt(sb.length()-1);
		}
		
		return sb.reverse().toString();
	}
}
