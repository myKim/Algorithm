package my.baekjoon.q10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_1002 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		while(T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			
			bw.write(String.valueOf(solution(x1, y1, r1, x2, y2, r2)));
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
	public static int solution(int x1, int y1, int r1, int x2, int y2, int r2) {
		if(x1 == x2 && y1 == y2) {
			if(r1 == r2) {
				return -1;  // ��ġ�� ������ ���Ѵ�
			}
			else {
				return 0;  // ��ġ�� ������ 0
			}
		}
		
		int dis1 = (x1-x2) * (x1-x2) + (y1-y2) * (y1-y2);  // ������(x1,y1)�� ���ȯ(x2,y2)�� �Ÿ��� ����
		int dis2 = (r1+r2) * (r1+r2);
		int dis3 = (r1-r2) * (r1-r2);
		
		if(dis1 > dis2) {
			return 0;
		}
		else if(dis1 < dis2) {
			if(dis1 > dis3) {
				return 2;
			}
			else if(dis1 == dis3) {
				return 1;
			}
			else {
				return 0;
			}
		}
		else {
			return 1;
		}
	}
	
}