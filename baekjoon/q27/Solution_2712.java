package my.baekjoon.ing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_2712 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine().trim());
		
		while(T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			double x = Double.parseDouble(st.nextToken());
			String u = st.nextToken();
			
			String res = translate(x, u);
			
			bw.write(res);
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
	public static String translate(double x, String u) {
		StringBuilder sb = new StringBuilder();
		
		switch(u) {
		case "kg": // -> lb
			x *= 2.2046;
			u = "lb";
			break;
		case "lb": // -> kg
			x *= 0.4536;
			u = "kg";
			break;
		case "l": // -> g
			x *= 0.2642;
			u = "g";
			break;
		case "g": // -> l
			x *= 3.7854;
			u = "l";
			break;
		}
		return sb.append(String.format("%.4f", x)).append(" "+u).toString();
	}
}
