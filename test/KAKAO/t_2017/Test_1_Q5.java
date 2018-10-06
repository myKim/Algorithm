package my.kakao.t_2017;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class Test_1_Q5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		int u = getUnionCount(str1, str2);
		int i = getIntersectionCount(str1, str2);
		
		int res = 65536;
		if(u > 0) {
			res = (int) (((double) i / u) * 65536);
		}

		bw.write(String.valueOf(res));
		
		br.close();
		bw.close();
	}
	
	// 합집합
	public static int getUnionCount(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();
		
		PriorityQueue<String> q1 = new PriorityQueue<String>();
		PriorityQueue<String> q2 = new PriorityQueue<String>();
		
		char[] arr1 = a.length() < b.length() ? a.toCharArray() : b.toCharArray();
		char[] arr2 = a.length() < b.length() ? b.toCharArray() : a.toCharArray();
		
		for(int i=0; i<arr1.length-1; i++) {
			if(('a' <= arr1[i] && arr1[i] <= 'z') && ('a' <= arr1[i+1] && arr1[i+1] <= 'z')) {
				q1.offer(new StringBuilder().append(arr1[i]).append(arr1[i+1]).toString());
			}
		}
		for(int i=0; i<arr2.length-1; i++) {
			if(('a' <= arr2[i] && arr2[i] <= 'z') && ('a' <= arr2[i+1] && arr2[i+1] <= 'z')) {
				q2.offer(new StringBuilder().append(arr2[i]).append(arr2[i+1]).toString());
			}
		}
		
		int cnt = 0;
		while(!q1.isEmpty() && !q2.isEmpty()) {
			if(q1.peek().compareTo(q2.peek()) < 0) {
				q1.poll();
				cnt++;
			}
			else if(q1.peek().compareTo(q2.peek()) > 0) {
				q2.poll();
				cnt++;
			}
			else {
				q1.poll();
				q2.poll();
				cnt++;
			}
		}
		cnt += q1.size();  // 큐에 남아있는 값을 더해준다.
		cnt += q2.size();  // 큐에 남아있는 값을 더해준다.
		
		return cnt;
	}
	
	// 교집합
	public static int getIntersectionCount(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();
		
		PriorityQueue<String> q1 = new PriorityQueue<String>();
		PriorityQueue<String> q2 = new PriorityQueue<String>();
		
		char[] arr1 = a.length() < b.length() ? a.toCharArray() : b.toCharArray();
		char[] arr2 = a.length() < b.length() ? b.toCharArray() : a.toCharArray();
		
		for(int i=0; i<arr1.length-1; i++) {
			if(('a' <= arr1[i] && arr1[i] <= 'z') && ('a' <= arr1[i+1] && arr1[i+1] <= 'z')) {
				q1.offer(new StringBuilder().append(arr1[i]).append(arr1[i+1]).toString());
			}
		}
		for(int i=0; i<arr2.length-1; i++) {
			if(('a' <= arr2[i] && arr2[i] <= 'z') && ('a' <= arr2[i+1] && arr2[i+1] <= 'z')) {
				q2.offer(new StringBuilder().append(arr2[i]).append(arr2[i+1]).toString());
			}
		}
		
		int cnt = 0;
		while(!q1.isEmpty() && !q2.isEmpty()) {
			if(q1.peek().compareTo(q2.peek()) < 0) {
				q1.poll();
			}
			else if(q1.peek().compareTo(q2.peek()) > 0) {
				q2.poll();
			}
			else {
				q1.poll();
				q2.poll();
				cnt++;
			}
		}
		return cnt;
	}
}
