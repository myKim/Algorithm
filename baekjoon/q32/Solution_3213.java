package my.baekjoon.q32;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_3213 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int a = 0;
		int b = 0;
		int c = 0;
		
		while(N-- > 0) {
			String line = br.readLine();
			switch(line) {
			case "1/4":
				a++;
				break;
			case "1/2":
				b++;
				break;
			case "3/4":
				c++;
				break;
			}
		}
		
		// r[i] : 남은 칸이 i개인 피자 판
		int[] r = new int[4];
		int tmp = 0;
		
		r[1] = c;
		r[2] = b;
		r[3] = a;
		
		tmp = Math.min(r[1], r[3]);
		r[1] -= tmp;
		r[3] -= tmp;
		r[0] += tmp;
		
		r[0] += r[2] / 2;
		r[2] %= 2;
		
		r[0] += r[3] / 4;
		r[3] %= 4;
		
		while(r[3]>0 && (r[1]>0 || r[2]>0)) {
			if(r[1]>0) {
				r[1]--;
				r[3]--;
				r[0]++;
			}
			else if(r[2]>0) {
				r[2]--;
				r[3]--;
				r[1]++;
			}
		}
		if(r[3]>1) {
			r[4-r[3]] = 1;
			r[3] = 0;
		}
		
		int sum = 0;
		for(int i : r) {
			sum += i;
		}
		
		System.out.print(sum);
		
		br.close();
	}
	
}
