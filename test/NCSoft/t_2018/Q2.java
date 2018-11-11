package my.ncsoft.t_2018;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		
		br.close();
		bw.close();
	}

	private String[][] solutionArr;
    private boolean[][] isVisit;
    private int[] dirY = {-1,-1,-1,0,0,1,1,1};
    private int[] dirX = {-1,0,1,-1,1,-1,0,1};

    public String[] solution(String[] board, int y, int x) {
        String[] answer = {};
        solutionArr = new String[board.length][board[0].length()];
        isVisit = new boolean[board.length][board[0].length()];

        answer = board;

        if(board[y].charAt(x) == 'M') {
            answer[y] = changeChar(answer[y], x, 'X');
        }
        else {
            search(y,x,answer);

            for(int i=0; i<answer.length; i++) {
                for(int j=0; j<answer.length; j++) {
                    if(answer[i].charAt(j) == 'M') {
                        answer[i] = changeChar(answer[y], j, 'E');
                    }
                }
            }
        }

        return answer;
    }

    private void search(int y, int x, String[] board) {
        if(!isPromise(y, x))
            return;

        isVisit[y][x] = true;

        int cnt = 0;
        for(int i=0; i<8; i++) {
            int newY = y + dirY[i];
            int newX = x + dirX[i];
            if(isPromise(newY, newX)) {
                if(board[newY].charAt(newX) == 'M') {
                    cnt++;
                }
            }
        }

        if(cnt == 0) {
            board[y] = changeChar(board[y], x, 'B');

            for(int i=0; i<8; i++) {
                int newY = y + dirY[i];
                int newX = x + dirX[i];
                if(isPromise(newY, newX) && !isVisit[newY][newX]) {
                    search(newY, newX, board);
                }
            }
        }
        else {
            board[y] = changeChar(board[y], x, Integer.toString(cnt).charAt(0));
        }
    }

    private boolean isPromise(int y, int x) {
        if(y>isVisit.length-1 || y< 0)
            return false;
        if(x>isVisit[0].length-1 ||x<0)
            return false;

        return true;
    }

    private String changeChar(String pre, int index, char ch) {
        StringBuilder sb = new StringBuilder(pre);
        sb.setCharAt(index, ch);
        return sb.toString();
    }
	
}
