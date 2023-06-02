import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFSStack {

	static int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};
	// 방문한 노드 체크용 - 인덱스가 노드 번호가 된다.
	static boolean[] visited = new boolean[graph.length];
	// 반환 List
	static List<Integer> answer = new ArrayList<>();

	// DFS 사용 할 스택
	static Stack<Integer> stack = new Stack<>();

	static List<Integer> dfsStack(int nodeIndex) {
		stack.push(nodeIndex);
		visited[nodeIndex] = true;

		while (!stack.isEmpty()) {
			nodeIndex = stack.pop();
			answer.add(nodeIndex);

			for (int i = 0; i < graph[nodeIndex].length; i++) {
				int node = graph[nodeIndex][i];

				if(!visited[node]) {
					stack.push(node);
					visited[node] = true;
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		int start = 1;
		List<Integer> result = dfsStack(start);
		System.out.println("result = " + result);
	}
}
