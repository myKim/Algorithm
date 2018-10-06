package my.nhn.t_2018;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int D = Integer.parseInt(br.readLine());
		int[] price = new int[D];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<D; i++) {
			price[i] = Integer.parseInt(st.nextToken());
		}
		
		int profit = 0;
		int cnt = 0;
		int i = 0;
		while(i < price.length) {
			int maxIdx = getMaxIdx(price, i);
			if(maxIdx == i) {
				break;
			}
			
			for(; i<maxIdx; i++) {
				profit -= price[i];
				cnt++;
			}
			profit += (price[maxIdx] * cnt - 1);
			cnt = 0;
			i++;
		}
		
		bw.write(String.valueOf(profit));
		
		
		br.close();
		bw.close();
	}
	
	public static int getMaxIdx(int[] arr, int startIdx) {
		int res = startIdx;
		for(int i=startIdx+1; i<arr.length; i++) {
			if(arr[res] <= arr[i]) {
				res = i;
			}
		}
		return res;
	}
	
}
