package my.baekjoon.q19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_1924 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		int day = 0;
		
		// 월 차이 계산
		for(int i=1; i<=x-1; i++) {
			switch(i) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				day += 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				day += 30;
				break;
			case 2:
				day += 28;
				break;
			}
		}
		// 일 차이 계산
		day += (y - 1);
		
		String week = null;
		switch(day % 7) {
		case 0:
			week = "MON";
			break;
		case 1:
			week = "TUE";
			break;
		case 2:
			week = "WED";
			break;
		case 3:
			week = "THU";
			break;
		case 4:
			week = "FRI";
			break;
		case 5:
			week = "SAT";
			break;
		case 6:
			week = "SUN";
			break;
			
		}
		
		bw.write(week);
		
		br.close();
		bw.close();
	}

}
