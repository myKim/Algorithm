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
		
		int n = Integer.parseInt(br.readLine()); // ��Ʋ ���� Ƚ��
		int t = Integer.parseInt(br.readLine()); // ��Ʋ ���� ����
		int m = Integer.parseInt(br.readLine()); // �� ��Ʋ�� Ż�� �ִ� �ִ� ��
		
		StringTokenizer st = new StringTokenizer(br.readLine(), "[ ,\"]����");
		int[] crews = new int[st.countTokens()];
		
		int idx = 0;
		while(st.hasMoreTokens()) {
			StringTokenizer st2 = new StringTokenizer(st.nextToken(), ":");
			int hour = Integer.parseInt(st2.nextToken());
			int min = Integer.parseInt(st2.nextToken());
			crews[idx++] = hour * 60 + min;  // ũ�� �����ð� ���� (��)
		}
		Arrays.sort(crews);
		
		int[] buses = new int[n];
		for(int i=0; i<n; i++) {
			buses[i] = 9 * 60 + t * i;  // ���� �����ð� ���� (��)
		}
		
		int cur = 0;  // ���� ũ���� �ε���
		int cnt = 0;  // ���� ž���� �ο�
		for(int i=0; i<buses.length; i++) {
			//System.out.println(i + " " + buses[i] + " ��������");
			cnt = 0;
			while((cur < crews.length) && (crews[cur] <= buses[i] && cnt < m)) { 
				//System.out.println(crews[cur] + "�п� ������ " + cur + "�� ũ�� " + " " + i + "�� ������" + (cnt+1) + "��°�� ž��");
				cur++;
				cnt++;
			}
		}
		
		int res = 0;
		if(cnt < m) {	// ������ ������ �ڸ��� ���� ��, ������ ������ Ÿ�� �ȴ�.
			res = buses[buses.length-1];
		}
		else {	// ������������ �ڸ��� ���� ���, �������� ź �°� -1�п� �;� �Ѵ�.
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
