package my.kakao.t_2017;

public class Test_1_Q1_2 {

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
			int mask = (int) Math.pow(2, res.length - 1);
			
			for(int i=mask; i>0; i>>=1) {
				if((r & i) != 0) {
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
