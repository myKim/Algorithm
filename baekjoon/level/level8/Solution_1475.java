package my.level8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_1475 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int X = Integer.parseInt(br.readLine());
		
		bw.write(getFraction(X));
		
		br.close();
		bw.close();
	}
	
	public static String getFraction(int X) {
		int level = 1;  // �м� �ܰ�
		int cnt = 1;    // �ش� �ܰ���� ���� ����
		
		while(cnt < X) {
			level++;
			cnt += level;
		}
		
		// ¦�� : �Ʒ�����(��)    / Ȧ�� : ������(��)
		int num1, num2; 
		num1 = 1;
		num2 = level;
		
		while(X != cnt) {
			num1++;
			num2--;
			cnt--;
		}
		
		StringBuilder sb = new StringBuilder();
		if(level % 2 == 0) {  // ¦��
			sb.append(num2).append("/").append(num1);
		}
		else {  // Ȧ��
			sb.append(num1).append("/").append(num2);
		}
		return sb.toString();
	}
}
