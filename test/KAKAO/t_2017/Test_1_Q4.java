package my.kakao.t_2017;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test_1_Q4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine()); // 셔틀 운행 횟수
		int t = Integer.parseInt(br.readLine()); // 셔틀 운행 간격
		int m = Integer.parseInt(br.readLine()); // 한 셔틀에 탈수 있는 최대 수
		
		StringTokenizer st = new StringTokenizer(br.readLine(), "[ ,\"]“”");
		int[] crews = new int[st.countTokens()];
		
		int idx = 0;
		while(st.hasMoreTokens()) {
			StringTokenizer st2 = new StringTokenizer(st.nextToken(), ":");
			int hour = Integer.parseInt(st2.nextToken());
			int min = Integer.parseInt(st2.nextToken());
			crews[idx++] = hour * 60 + min;  // 크루 도착시간 저장 (분)
		}
		Arrays.sort(crews);
		
		int[] buses = new int[n];
		for(int i=0; i<n; i++) {
			buses[i] = 9 * 60 + t * i;  // 버스 도착시간 저장 (분)
		}
		
		int cur = 0;  // 현재 크루의 인덱스
		int cnt = 0;  // 버스 탑승한 인원
		for(int i=0; i<buses.length; i++) {
			//System.out.println(i + " " + buses[i] + " 버스도착");
			cnt = 0;
			while((cur < crews.length) && (crews[cur] <= buses[i] && cnt < m)) { 
				//System.out.println(crews[cur] + "분에 도착한 " + cur + "번 크루 " + " " + i + "번 버스에" + (cnt+1) + "번째로 탑승");
				cur++;
				cnt++;
			}
		}
		
		int res = 0;
		if(cnt < m) {	// 마지막 버스에 자리가 있을 때, 마지막 버스를 타면 된다.
			res = buses[buses.length-1];
		}
		else {	// 마지막버스에 자리가 없을 경우, 마지막에 탄 승객 -1분에 와야 한다.
			res = crews[cur-1] - 1;
		}
		
		bw.write(getTimeString(res));
		
		br.close();
		bw.close();
	}
	
	public static String getTimeString(int t) {
		StringBuilder sb = new StringBuilder();
		int h = (t / 60) % 24;
		int m = t % 60;
		
		return sb.append(String.format("%02d", h)).append(":").append(String.format("%02d", m)).toString();
	}
	
}
