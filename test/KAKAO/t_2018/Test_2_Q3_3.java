package my.kakao.t_2018;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class Test_2_Q3_3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Test_2_Q3_3 t = new Test_2_Q3_3();
//		String[][] input = {{"1","A","a"},{"2","A","c"},{"3","B","a"}};
		String[][] input = {{"100","ryan","music","2"},{"200","apeach","math","2"},{"300","tube","computer","3"},{"400","con","computer","4"},{"500","muzi","music","3"},{"600","apeach","music","2"}};
		
		int cnt = t.solution(input);
		System.out.println(cnt);
		
		bw.close();
		br.close();
	}
	
    public int solution(String[][] relation) {
    	int row = relation[0].length;
    	int col = relation.length;
    	
    	final int MAX_BIT = (1<<row) - 1;

    	ArrayList<Integer> keyList = new ArrayList<>();
    	
    	int cnt = 0;
    	for(int i=1; i<=MAX_BIT; i++) {
    		if(isEnableKey(i, keyList)) {
    			String[] key = createKeySet(relation, i, keyList);
    			
    			if(isUnique(key)) {  // ���� ���� key�� ���
//    				System.out.println("key is :" + Integer.toBinaryString(i));
    				keyList.add(i);
    				cnt++;
    			}
    		}
    	}
    	
        return cnt;
    }
    
    
    public static boolean isEnableKey(int bitMask, ArrayList<Integer> keyList) {
    	for(int i : keyList) {
    		if((i & bitMask) == i) {
    			return false;
    		}
    	}
    	return true;
    }
    
    public static String[] createKeySet(String[][] relation, int bitMask, ArrayList<Integer> keyList) {
    	int row = relation[0].length;
    	int col = relation.length;
    	
    	// ������ key set ����
    	String[] keySet = new String[col];
    	for(int i=0; i<col; i++) {
    		StringBuilder sb = new StringBuilder();
    		for(int j=0; j<row; j++) {
    			if((bitMask & (1<<j)) != 0) {  // ��Ʈ �ڸ��� 1 ���� üũ
    				sb.append(relation[i][j]);
    			}
    		}
    		keySet[i] = sb.toString();
    	}
    	
    	return keySet;
    }
    
    public static boolean isUnique(String[] arr) {
    	Arrays.sort(arr);
    	for(int i=0; i<arr.length-1; i++) {
    		if(arr[i].equals(arr[i+1])) {
    			return false;
    		}
    	}
    	return true;
    }
    
}
