package my.baekjoon.q10;

import java.util.Scanner;

public class Solution_1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int cnt = 0;
		for(int i=1; i<=N; i++) {
			if(isHansoo(i)) cnt++;
		}
		System.out.println(cnt);
	}
	
	public static boolean isHansoo(int num) {
		boolean result = true;
		int tmp = num;
		int dif, num1, num2;
		
		// 뒷자리부터 잘라내어 등차가 같은지 확인
		num1 = tmp % 10;
		tmp /= 10;
		num2 = tmp % 10;
		tmp /= 10;
		
		dif = num1 - num2;
		
		while(tmp != 0) {
			num1 = num2;
			num2 = tmp % 10;
			tmp /= 10;
			
			if(num1 - num2 != dif) {
				result = false;
				break;
			}
		}
		return result;
	}
}
