package my.kakao.t_2018;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Test_2_Q3_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Test_2_Q3_1 t = new Test_2_Q3_1();
//		String[][] input = {{"100","ryan","music","2"},{"200","apeach","math","2"},{"300","tube","computer","3"},{"400","con","computer","4"},{"500","muzi","music","3"},{"600","apeach","music","2"}};
		String[][] input = {{"1","A","a"},{"2","A","c"},{"3","B","a"}};
		
		int res = t.solution(input);
		System.out.println(res);
		bw.close();
		br.close();
	}
	
////////////////////////////////////////////////////////////////////
	static boolean[] isUse;
	static String[][] rel;
	static int cnt = 0;
	
    public int solution(String[][] relation) {
        rel = relation;
        isUse = new boolean[relation[0].length];
        Arrays.fill(isUse, false);
        
        // 컬럼 개수별 루프
        
        for(int i=1; i<=relation.length; i++) {
//        	System.out.println("개수 : " + i + "개");
        	int[] set = new int[i];
        	Arrays.fill(set, -1);
        	check(set, 0, 0);
        }
        
        return cnt;
    }
    
    public static void check(int[] set, int idx, int start) {
    	
    	
    	if(idx >= set.length) {
//    		System.out.print(" - Set : ");
//    		for(int i=0; i<set.length; i++) {
//    			System.out.print(set[i]);
//    		}
//    		System.out.println();
    		
    		String[] key = new String[rel.length];
    		
    		for(int i=0; i<key.length; i++) {
    			StringBuilder sb = new StringBuilder();
    			
    			for(int j=0; j<set.length; j++) {
        			sb.append(rel[i][set[j]]);
        		}
    			key[i] = sb.toString();
    		}
    		
    		if(isUnique(key)) {
    			cnt++;
    			for(int i : set) {
    				isUse[i] = true;
    			}
    		}
    		return;
    	}
    	
//    	if(start >= rel[0].length) {
//    		return;
//    	}
    	
    	for(int i=start; i<rel[0].length; i++) {
//    		System.out.println("i : " + i);
    		if(!isUse[i]) {
    			set[idx] = i;
//    			System.out.println("call check idx: " + (idx+1) + " i: " + (i+1));
    			check(set, idx+1, i+1);
    		}
    	}
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
////////////////////////////////////////////////////////////////////
}
