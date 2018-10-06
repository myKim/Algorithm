package my.baekjoon.q112;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution_11286 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer n1, Integer n2) {
				return Math.abs(n1) != Math.abs(n2) ? Math.abs(n1) - Math.abs(n2) : n1 - n2;
			}
		});
		
		while(N-- > 0) {
			int command = Integer.parseInt(br.readLine());
			
			if(command == 0) {
				if(pq.isEmpty()) {
					bw.write(String.valueOf(0));
				}
				else {
					bw.write(String.valueOf(pq.poll()));
				}
				bw.newLine();
			}
			else {
				pq.offer(command);
			}
		}
		
		br.close();
		bw.close();
	}
}
