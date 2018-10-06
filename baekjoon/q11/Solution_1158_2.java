package my.baekjoon.q11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution_1158_2 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=1; i<=N; i++) {
			list.add(i);
		}
		
		// ���� ���ڿ� ����
		StringBuilder sb = new StringBuilder();
		int idx = 0;
		sb.append("<");
		while(!list.isEmpty()) {
			idx = (idx + M - 1) % list.size();  // ��ǥ ���� ��ġ ��� (M��° ����)
			sb.append(String.valueOf(list.remove(idx))).append(", ");
		}
		if(sb.substring(sb.length()-2, sb.length()).equals(", ")) { // ������ �޸� ����
			sb.delete(sb.length()-2, sb.length());
		}
		sb.append(">");
		
		bw.write(sb.toString());
		
		br.close();
		bw.close();
	}
	
}
