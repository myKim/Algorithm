package my.kakao.t_2017;

public class Test_1_Q1_1 {

	public static void main(String[] args) {
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		
		solution(arr1, arr2);
	}
	
	public static void solution(int[] arr1, int[] arr2) {
		int[] res = new int[arr1.length];
		
		for(int i=0; i<res.length; i++) {
			res[i] = arr1[i] | arr2[i];
		}
		
		StringBuilder sb = new StringBuilder();
		for(int r : res) {
			char[] array = Integer.toBinaryString(r).toCharArray();
			for(char c : array) {
				if(c == '1') {
					sb.append("#");
				}
				else {
					sb.append(" ");
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
