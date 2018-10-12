package my.baekjoon.q29;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution_2981 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		
		// arr[1]-arr[0] ... arr[n]-arr[n-1] 간의 최대공약수
		int G = arr[1]-arr[0];
		for(int i=2; i<arr.length; i++) {
			G = gcd(G, arr[i]-arr[i-1]);
		}
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(); 
		int size = (int) Math.sqrt(G);
		for(int i=1; i<=size; i++) {
			if(G%i == 0) {
				pq.offer(i); // 약수 삽입
				if(G/i!=i) {
					pq.offer(G/i); // 서로소 약수 삽입
				}
			}
		}
		
		while(!pq.isEmpty()) {
			int num = pq.poll();
			if(num != 1) {
				bw.write(num + " ");
			}
		}
		
		br.close();
		bw.close();
	}
	
	public static int gcd(int A, int B) {
		return (B==0) ? A : gcd(B, A%B);
	}
	
}