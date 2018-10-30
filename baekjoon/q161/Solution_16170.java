package my.baekjoon.q161;

import java.io.IOException;
import java.util.Calendar;

public class Solution_16170 {

	public static void main(String[] args) throws IOException {
		Calendar cal = Calendar.getInstance();
		
		int Y = cal.get(Calendar.YEAR);
		int M = cal.get(Calendar.MONTH) + 1;
		int D = cal.get(Calendar.DATE);
		
		System.out.printf("%04d\n", Y);
		System.out.printf("%02d\n", M);
		System.out.printf("%02d\n", D);
	}
	
}