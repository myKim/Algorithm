package my.baekjoon.q11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1107_1 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 1. Input
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		StringTokenizer st = null;
		
		boolean[] btn = new boolean[10];
		Arrays.fill(btn, true);
		
		if(M > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			
			for(int i=0; i<M; i++) {
				btn[Integer.parseInt(st.nextToken())] = false;
			}
		}
		
		// 2. Solution
		int c = 100;
		int minCnt = Math.abs(N - c);
		
		if(M == 0) {
			minCnt = Math.min(minCnt, String.valueOf(N).length());
		}
		else if(M < 10) {
			int maxLowerNum = getMaxLowerNum(N, btn);
			int minGreaterNum = getMinGreaterNum(N, btn);
			
			
			if(maxLowerNum > 0) {
				minCnt = Math.min(minCnt, getMaxLowerNum(N, btn));
			}
			if(minGreaterNum > 0) {
				minCnt = Math.min(minCnt, getMinGreaterNum(N, btn));
			}
		}
		
		bw.write(String.valueOf(minCnt));
			
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static int getBtnMax(boolean[] btn) {
		for(int i=btn.length-1; i>0; i--) {
			if(btn[i]) {
				return i;
			}
		}
		return -1;
		
	}
	public static int getBtnMin(boolean[] btn) {
		for(int i=0; i<btn.length; i++) {
			if(btn[i]) {
				return i;
			}
		}
		return -1;
	}
	
	public static int getMaxLowerNum(int N, boolean[] btn) {		
		String str = String.valueOf(N);
		int btnMax = getBtnMax(btn);
		
		int[] arr1 = new int[str.length()+1];
		int[] arr2 = new int[str.length()+1];
		
		arr1[0] = 0;
		for(int i=0; i<str.length(); i++) {
			arr1[i+1] = str.charAt(i)-'0';
		}
		
		int i = 1;
		while(i<arr1.length) {
			if(btn[arr1[i]]) {
				arr2[i] = arr1[i];
				i++;
			}
			else {
				break;
			}
		}
		
		// 작은 수
		arr2[i] = 0;
		for(int j=arr1[i]-1; j>=0; j--) {
			if(btn[j]) {
				arr2[i] = j;
				break;
			}
		}
		
		if(arr2[i] == 0) {
			if(!btn[arr2[i]]) {
				return -1;
			}
		}
		i++;
		
		while(i<arr1.length) {
			arr2[i++] = btnMax;
		}
		
		int num = toNumber(arr2);
		return Math.abs(num - N) + String.valueOf(num).length();
	}
	
	public static int getMinGreaterNum(int N, boolean[] btn) {
		String str = String.valueOf(N);
		int btnMin = getBtnMin(btn);
		
		int[] arr1 = new int[str.length()+1];
		int[] arr2 = new int[str.length()+1];
		
		arr1[0] = 0;
		for(int i=0; i<str.length(); i++) {
			arr1[i+1] = str.charAt(i)-'0';
		}
		
		int i = 1;
		while(i<arr1.length) {
			if(btn[arr1[i]]) {
				arr2[i] = arr1[i];
				i++;
			}
			else {
				break;
			}
		}
		
		// 큰 수
		arr2[i] = 0;
		for(int j=arr1[i]+1; j<btn.length; j++) {
			if(btn[j]) {
				arr2[i] = j;
				break;
			}
		}
		
		if(arr2[i] == 0) {
			if(btn[arr2[i-1]+1]) {
				arr2[i-1]++; 
			}
			else {
				return -1;
			}
		}
		else {
			i++;
		}
		
		while(i<arr1.length) {
			arr2[i++] = btnMin;
		}
		
		int num = toNumber(arr2);
		return Math.abs(num - N) + String.valueOf(num).length();
	}
	
	public static int toNumber(int[] arr) {
		int result = 0;
		for(int i=0; i<arr.length; i++) {
			result = result * 10 + arr[i]; 
		}
		return result;
	}
	
}
