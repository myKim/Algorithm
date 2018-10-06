package my.baekjoon.q13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1325_1 {

	static int[] dp;
	static ArrayList<Integer>[] trust;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		trust = new ArrayList[N+1];
		for(int i=0; i<trust.length; i++) {
			trust[i] = new ArrayList<Integer>();
		}
		
		while(M-- > 0) {
			st = new StringTokenizer(br.readLine());
			int tar = Integer.parseInt(st.nextToken());
			int src = Integer.parseInt(st.nextToken());
			trust[src].add(tar);
		}
		
		// Solution
		dp = new int[N+1];
		Arrays.fill(dp, -1);
		
		int max = -1;
		for(int i=1; i<dp.length; i++) {
			max = Math.max(max, solution(i));
		}
		
		for(int i=0; i<dp.length; i++) {
			System.out.println(i + "��ǻ�� ��� : " + dp[i] + " ");
		}
		
		// Output
		for(int i=1; i<dp.length; i++) {
			if(dp[i] == max) {
				bw.write(i + " ");
			}
		}
		
		br.close();
		bw.close();
	}
	
	// ����Ŭ�� ������ ��� Stack overflow �߻�
	// ex) 5 2
	//     1 2
	//     2 1
	public static int solution(int i) {
		if(dp[i] >= 0) {
			System.out.println("�̹� ���� " + i);
			return dp[i];
		}
		
		int res = 1;		
		for(int tar : trust[i]) {
			System.out.println("  " + i + "�� ��ǻ���� ���� : " + tar);
			res += solution(tar);
		}
		dp[i] = res;
		System.out.println(i + " ��ǻ�� �� : " + res);
		
		return res;
	}
	
}
