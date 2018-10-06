package my.baekjoon.q118;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_11800 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for(int i=1; i<=T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			StringBuilder sb = new StringBuilder();
			sb.append("Case ").append(String.valueOf(i)).append(": ").append(getResult(a, b));
			
			bw.write(sb.toString());
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
	public static String getResult(int a, int b) {
		if(a == b) {
			switch(a) {
			case 1: return "Habb Yakk";
			case 2: return "Dobara";
			case 3: return "Dousa";
			case 4: return "Dorgy";
			case 5: return "Dabash";
			case 6: return "Dosh";
			}
		}
		
		int[] arr = new int[2];
		arr[0] = Math.max(a, b);
		arr[1] = Math.min(a, b);
		
		if(arr[0] == 6 && arr[1] == 5) {
			return "Sheesh Beesh";
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<arr.length; i++) {
			if(i!=0) sb.append(" ");
			
			switch(arr[i]) {
			case 1: sb.append("Yakk"); break;
			case 2: sb.append("Doh"); break;
			case 3: sb.append("Seh"); break;
			case 4: sb.append("Ghar"); break;
			case 5: sb.append("Bang"); break;
			case 6: sb.append("Sheesh"); break;
			}
		}
		return sb.toString();
	}
}
