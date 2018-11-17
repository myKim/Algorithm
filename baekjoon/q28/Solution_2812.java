package my.baekjoon.q28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Solution_2812 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = br.read()-'0';
		}
		
		Deque<Integer> dq = new LinkedList<>();
		for(int i=0; i<arr.length; i++) {
			int n = arr[i];
			int remain = arr.length - i;
			
			while(!dq.isEmpty() && dq.peekLast()<n && K>0) {
				dq.pollLast();
				K--;
			}
			if(remain>K) { // ���� ���ڰ� �� �־�� �ϴ��� ������ �ϴ��� Ȯ��
				dq.offerLast(n);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i : dq) {
			sb.append(i);
		}
		
		System.out.print(sb);
		
		br.close();
	}
	
}
