package my.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_2711 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		while(T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int index = Integer.parseInt(st.nextToken())-1;
			char[] arr = st.nextToken().toCharArray();
			
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<arr.length; i++) {
				if(i!=index) {
					sb.append(arr[i]);
				}
			}
			bw.write(sb.toString());
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
}
