package my.baekjoon.q19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution_1991 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		
		Node root = new Node("A");
		
		while(N-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String parent = st.nextToken();
			String left = st.nextToken();
			String right = st.nextToken();
			
			Node node = getNode(root, parent);
			if(node != null) {
				if(!left.equals(".")) {
					node.left = new Node(left);
				}
				if(!right.equals(".")) {
					node.right = new Node(right);
				}
			}
		}
		
		preOrder(root);
		System.out.println();
		inOrder(root);
		System.out.println();
		postOrder(root);
		System.out.println();
		
		br.close();
	}
	
	public static void preOrder(Node root) {
		if(root == null) return;
		
		System.out.print(root);
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public static void postOrder(Node root) {
		if(root == null) return;
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root);
	}
	
	public static void inOrder(Node root) {
		if(root == null) return;
		
		inOrder(root.left);
		System.out.print(root);
		inOrder(root.right);
	}
	
	public static Node getNode(Node root, String value) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty()) {
			Node node = q.poll();
			if(node.value.equals(value)) {
				return node;
			}
			
			if(node.left != null) {
				q.offer(node.left);
			}
			if(node.right != null) {
				q.offer(node.right);
			}
		}
		
		return null;
	}
	
	static class Node {
		String value;
		Node left;
		Node right;
		
		public Node(String value) {
			this.value = value;
			this.left = null;
			this.right = null;
		}

		@Override
		public String toString() {
			return value;
		}
	}
	
}
