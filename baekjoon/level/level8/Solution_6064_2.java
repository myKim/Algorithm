package my.level8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_6064_2 {

	public static void main(String[] args) throws IOException {
		
		// 1. Input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		int[] M = new int[T];
		int[] N = new int[T];
		int[] x = new int[T];
		int[] y = new int[T];
		
		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			M[i] = Integer.parseInt(st.nextToken());
			N[i] = Integer.parseInt(st.nextToken());
			x[i] = Integer.parseInt(st.nextToken()) - 1;  // �ε��� 0���� �����ϱ� ���� -1 
			y[i] = Integer.parseInt(st.nextToken()) - 1;  // �ε��� 0���� �����ϱ� ���� -1
		}
		
		// 2. Solution
		for(int i=0; i<T; i++) {
			int year = 0;
			int tmpX = 0;
			int tmpY = 0;
			int bp;
			
			// �ʱⰪ ����
			if(M[i] > N[i]) {
				year = x[i] + 1;
				tmpX = x[i];
				tmpY = x[i] % N[i];
				bp = tmpY;
			}
			else {
				year = y[i] + 1;
				tmpX = y[i] % M[i];
				tmpY = y[i];
				bp = tmpX;
			}
			
			// ������ ���� ���� üũ
			while(tmpX != x[i] || tmpY != y[i]) {  // ���� ã�� ������ ����
				if(M[i] > N[i]) {  // M�� �� Ŭ ��� x�� ������Ű�� y�� �����Ű�� ���� üũ
					year += M[i];
					tmpY = (tmpY + M[i]) % N[i];
					if(tmpY == bp) {  // ���氪�� ���ʰ�(bp)���� �ٽ� ���ƿ� ���: �� ���� 
						year = -1;
						break;
					}
				}
				else {  // y�� ������Ű�� x�� �����Ű�� ���� üũ
					year += N[i];
					tmpX = (tmpX + N[i]) % M[i];
					if(tmpX == bp) {  // ���氪�� ���ʰ�(bp)���� �ٽ� ���ƿ� ���: �� ����
						year = -1;
						break;
					}
				}
			}
			
			bw.write(String.valueOf(year));
			bw.newLine();
		}
		br.close();
		bw.close();
	}
}
