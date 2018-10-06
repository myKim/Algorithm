package my.kakao.t_2017;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test_1_Q2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String dartResult = br.readLine();
		
		bw.write(String.valueOf(solution(dartResult)));
		
		bw.close();
		br.close();
	}
	
	public static int solution(String dartResult) {
		int score = 0;
		
		dartResult = dartResult.toUpperCase();
		
		String regex ="^((\\d{1,2})([A-Z]{1})([*#]?))((\\d{1,2})([A-Z]{1})([*#]?))((\\d{1,2})([A-Z]{1})([*#]?))$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(dartResult);
		
		if(m.matches()) {
//			for(int i=0; i<=m.groupCount(); i++) {
//				System.out.println("group(" + i + "):" + m.group(i));
//			}
			int[] point = new int[3];
			String[] bonus = new String[3];
			String[] option = new String[3];
			
			point[0] = Integer.parseInt(m.group(2));
			point[1] = Integer.parseInt(m.group(6));
			point[2] = Integer.parseInt(m.group(10));
			bonus[0] = m.group(3);
			bonus[1] = m.group(7);
			bonus[2] = m.group(11);
			option[0] = m.group(4);
			option[1] = m.group(8);
			option[2] = m.group(12);
			
			int tmp[] = new int[3];
			for(int i=0; i<3; i++) {
				int b = 0;
				switch(bonus[i]) {
				case "S":
					b = 1;
					break;
				case "D":
					b = 2;
					break;
				case "T":
					b = 3;
					break;
				}
				
				tmp[i] = (int) Math.pow(point[i], b);
				
				switch(option[i]) {
				case "#":
					tmp[i] *= -1;
					break;
				case "*":
					tmp[i] *= 2;
					if(i > 0) {
						tmp[i-1] *= 2;
					}
					break;
				}
			}
			
			for(int t : tmp) {
				score += t;
			}
		}
		return score;
	}
}
