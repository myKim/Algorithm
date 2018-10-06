package my.baekjoon.q21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Solution_2108 {

	public static void main(String[] args) throws IOException {
		
		// 1. Input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] array = new int[N];
		for(int i=0; i<N; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		
		// 2. Solution
		int avg = getAvg(array);
		int mid = getMid(array);
		int mod = getMod(array);
		int rng = getRng(array);
		
		bw.write(String.valueOf(avg));
		bw.newLine();
		bw.write(String.valueOf(mid));
		bw.newLine();
		bw.write(String.valueOf(mod));
		bw.newLine();
		bw.write(String.valueOf(rng));
		bw.newLine();
		br.close();
		bw.close();
	}
	
	public static int getAvg(int[] array) {
		int result = 0;
		
		float sum = 0;
		for(int n : array) {
			sum += n;
		}
		
		result = Math.round(sum / array.length);
		
		return result;
	}
	public static int getMid(int[] array) {
		int[] tmpArray = array.clone();
		Arrays.sort(tmpArray);
		return tmpArray[tmpArray.length/2];
	}
	
	public static int getMod(int[] array) {
		int[] tmpArray = array.clone();
		Arrays.sort(tmpArray);
		
		int max = tmpArray[tmpArray.length-1];
		int min = tmpArray[0];
		int rng = max - min;
		
		if(rng == 0) {
			return array[0];
		}
		else {
			int index[] = new int[rng+1];
			Arrays.fill(index, 0);
			
			for(int i=0; i<tmpArray.length; i++) {
				index[tmpArray[i]-min]++;
			}
			int mode = 0;
			int maxCnt = 0;
			for(int i=0; i<index.length; i++) {
				if(maxCnt < index[i]) {
					maxCnt = index[i];
					mode = i;
				}
			}
			for(int i=mode+1; i<index.length; i++) {
				if(maxCnt == index[i]) {
					mode = i;
					break;
				}
			}
			return mode + min;
		}
	}
	
	public static int getRng(int[] array) {
		int[] tmpArray = array.clone();
		Arrays.sort(tmpArray);
		return tmpArray[tmpArray.length-1] - tmpArray[0];
	}
}
