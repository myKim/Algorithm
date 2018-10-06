package my.kakao.t_2017;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test_1_Q7 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		String[] input = new String[N];
		for(int i=0; i<N; i++) {
			input[i] = br.readLine();
		}
		
		String regex = "^((\\d{1,4})-(\\d{2})-(\\d{2})) *((\\d{1,2}):(\\d{1,2}):(\\d{1,2}).(\\d{1,3})) *(\\d+\\.?\\d{0,3})s$";
		Pattern pattern = Pattern.compile(regex);

		int[][] t = new int[input.length][2];
		for(int i=0; i<t.length; i++) {
			Matcher matcher = pattern.matcher(input[i]);
			
			if(matcher.matches()) {
				int hour = Integer.parseInt(matcher.group(6));
				int min = Integer.parseInt(matcher.group(7));
				int sec = Integer.parseInt(matcher.group(8));
				int ms = Integer.parseInt(matcher.group(9));
				int period = (int) (Float.parseFloat(matcher.group(10)) * 1000);
				
				t[i][1] = hour * 60 * 60 * 1000 + min * 60 * 1000 + sec * 1000 + ms;
				t[i][0] = t[i][1] - period + 1;
				
//				System.out.println(t[i][0] + " ~ " + t[i][1]);
			}
		}
		
		int max = 0;
		for(int i=0; i<t.length; i++) {
			// 왼쪽 1000ms 체크
			int cnt = 0;
			for(int j=0; j<t.length; j++) {
				if(t[i][0] >= t[j][0] && t[j][1] >= t[i][0]-999) {
					cnt++;
				}
			}
			max = Math.max(max, cnt);
			
			// 오른쪽 1000ms 체크
			cnt = 0;
			for(int j=0; j<t.length; j++) {
				if(t[i][1]+999 >= t[j][0] && t[j][1] >= t[i][1]) {
					cnt++;
				}
			}
			max = Math.max(max, cnt);
		}
		
		bw.write(String.valueOf(max));
		
		br.close();
		bw.close();
	}
	
}
