package my.baekjoon.q108;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
import java.util.StringTokenizer;

public class Solution_10827_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigDecimal num = new BigDecimal(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		num = num.pow(b);
		
		bw.write(num.toPlainString());
		bw.newLine();
		
		br.close();
		bw.close();
	}
	
}
