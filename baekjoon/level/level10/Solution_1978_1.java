package my.level10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_1978_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[] array = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<N; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		int cnt = 0;
		for(int n : array) {
			if(isPrime(n)) {
				cnt++;
			}
		}
		
		bw.write(String.valueOf(cnt));
		
		br.close();
		bw.close();
	}
	
	public static boolean isPrime(int n) {
		if(n < 2) {
			return false;
		}
		int sqrtN = (int) Math.sqrt(n);
		for(int i=2; i<=sqrtN; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
