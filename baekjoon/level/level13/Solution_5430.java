package my.level13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Solution_5430 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		while(T-- > 0) {
			// Input
			char[] command = br.readLine().toCharArray();  // ��ɾ� ���
			int n = Integer.parseInt(br.readLine());  // ������ ����
			int[] x = new int[n];
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " [],");
			for(int i=0; i<x.length; i++) {
				x[i] = Integer.parseInt(st.nextToken());  // ���� ���
			}
			
			// Solution
			AC ac = new AC(x);
			for(int i=0; i<command.length; i++) {
				switch(command[i]) {
				case 'R':
					ac.R();
					break;
				case 'D':
					ac.D();
					break;
				}
			}
			
			bw.write(ac.getResult());
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
	
	public static class AC {
		Deque<Integer> dq;  // ���ڸ� ������ ��
		boolean reverse;  // ���������� Flag (���� �ڷḦ ������ �ʴ´�.)
		boolean isError;  // ���� Flag (������� �� D�� �� ��쿡�� �����̴�.)
		
		public AC(int[] input) {
			reverse = false;
			isError = false;
			dq = new LinkedList<>();
			
			if(input != null) {
				for(int i : input) {
					dq.offer(i);
				}
			}
		}
		
		public void R() {
			reverse = reverse ? false : true;  // reverse Flag ���
		}
		
		public void D() {
			if(dq.isEmpty()) {
				isError = true;  // ������� �� D�� �����ϸ� Error
				return;
			}
			
			if(!reverse) {
				dq.pollFirst();
			}
			else {
				dq.pollLast();
			}
		}
		
		public String getResult() {  // ��� ���ڿ� ����
			if(dq.isEmpty()) { 
				return isError ? "error" : "[]";
			}
			StringBuilder sb = new StringBuilder();
			
			sb.append("[");
			while(!dq.isEmpty()) {
				if(!reverse) {
					sb.append(dq.pollFirst()).append(",");
				}
				else {
					sb.append(dq.pollLast()).append(",");
				}
			}
			if(sb.charAt(sb.length()-1) == ',') {
				sb.deleteCharAt(sb.length()-1);
			}
			sb.append("]");
			return sb.toString();
		}
	}
	
}
