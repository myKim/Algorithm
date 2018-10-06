package my.kakao.t_2018;

import java.util.Arrays;

public class Test_2_Demo_1 {

	public static void main(String[] args) {
		
		Test_2_Demo_1 t = new Test_2_Demo_1();
		int[] input = {4,1,3,2};
		System.out.println(t.solution(input));
		
	}
	
////////////////////////////////////////////////////////////////////
	public boolean solution(int[] arr) {
		int[] num = new int[100001];
		Arrays.fill(num, 0);
		
		for(int i=0; i<arr.length; i++) {
			num[arr[i]]++;
		}
        for(int i=1; i<arr.length+1; i++) {
        	if(num[i]!=1) {
        		return false;
        	}
        }
        return true;
    }
////////////////////////////////////////////////////////////////////
}
