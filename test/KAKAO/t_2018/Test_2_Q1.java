package my.kakao.t_2018;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Test_2_Q1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		Test_2_Q1 t = new Test_2_Q1();
		String[] input = {"Enter uid1234 Muzi","Enter uid4567 Prodo","Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
		
		t.solution(input);
		
		
		bw.close();
		br.close();
	}
	
////////////////////////////////////////////////////////////////////
	public static String[] solution(String[] record) throws IOException  {
        ChattingRoom cr = new ChattingRoom(record.length);
        
        for(int i=0; i<record.length; i++) {
        	StringTokenizer st = new StringTokenizer(record[i]);
        	
        	String command = st.nextToken();
        	String id = null;
        	String nickName = null;
        	
        	switch(command) {
        	case "Enter":
        		id = st.nextToken();
        		nickName = st.nextToken();
        		cr.Enter(id, nickName);
        		break;
        	case "Leave":
        		id = st.nextToken();
        		cr.leave(id);
        		break;	
        	case "Change":
        		id = st.nextToken();
        		nickName = st.nextToken();
        		cr.change(id, nickName);
        		break;
        	}
        }
        return cr.getMessage();
    }
	
	public static class ChattingRoom {
		HashMap<String, String> users;
		String[][] log;
		int idx;
		
		public ChattingRoom(int n) {
			this.users = new HashMap<>();
			this.log = new String[n][2];
			this.idx = 0;
		}
		
		public void Enter(String id, String nickName) {
			users.put(id, nickName);
			log[idx][0] = id;
			log[idx][1] = "E";
			idx++;
		}
		
		public void leave(String id) {
			log[idx][0] = id;
			log[idx][1] = "L";
			idx++;
		}
		
		public void change(String id, String nickName) {
			users.put(id, nickName);
			log[idx][0] = id;
			log[idx][1] = "C";
			idx++;
		}
		
		public String[] getMessage() {
			ArrayList<String> message = new ArrayList<>();
			
			for(int i=0; i<log.length; i++) {
				StringBuilder sb = new StringBuilder();
				switch(log[i][1]) {
				case "E":
					sb.append(users.get(log[i][0])).append("´ÔÀÌ µé¾î¿Ô½À´Ï´Ù.");
					message.add(sb.toString());
					break;
				case "L":
					sb.append(users.get(log[i][0])).append("´ÔÀÌ ³ª°¬½À´Ï´Ù.");
					message.add(sb.toString());
					break;
				case "C":
					break;
				}
				
			}
			
			String[] answer = new String[message.size()];
			for(int i=0; i<answer.length; i++) {
				answer[i] = message.get(i);
			}
			return answer;
		}
	}
	
////////////////////////////////////////////////////////////////////
}
