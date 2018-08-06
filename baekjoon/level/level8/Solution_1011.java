package my.level8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_1011 {

	public static void main(String[] args) throws IOException {
		
		// 1. Input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		int[] x = new int[T];
		int[] y = new int[T];
		
		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}
		
		// 2. Solution
		for(int i=0; i<T; i++) {
			int left = 0;  // ���� ��ġ
			int right = y[i] - x[i];  // ������ ��ġ
			int cnt = 0;   // �̵� Ƚ��
			int dist = 1;
			
			while(left < right) {
				cnt++;
				if(cnt % 2 != 0) {  // �̵�Ƚ�� Ȧ�� : left �� Right
					left += dist;
				}
				else {  // �̵�Ƚ�� Ȧ�� : Right �� left
					right -= dist;
					dist++;
				}
			}
			
			bw.write(String.valueOf(cnt));  // ���� ���
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
}
