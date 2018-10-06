package my.baekjoon.q25;

import java.io.IOException;
import java.util.Scanner;

public class Solution_2501 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		
		int div = 0;
		for(int i=0; i<K; i++) {
			div++;
			if(div > N) {
				div = 0;
				break;
			}
			
			while(div <= N) {
				if(N % div == 0) {
					break;
				}
				div++;
			}
		}
		
		System.out.println(div);
	}
}