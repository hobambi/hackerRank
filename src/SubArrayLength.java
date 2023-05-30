import java.util.Arrays;
import java.util.List;

public class SubArrayLength {

	public static int maxLength(List<Integer> a, int k) {
		int answer = 0;

		for (int i = 0; i < a.size(); i++) {
			int pointer = i;
			int sum = 0;

			while (k > sum) {
				if(pointer >= a.size()) break;

				sum += a.get(pointer);
				if(sum == k) {

					if(answer < (pointer-i)) answer = pointer - i+1;
				} else if(sum > k) break;
				else pointer++;
			}
		}
		// System.out.println("answer = " + answer);

		return answer;
	}

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(1, 2, 3, 4, 2);
		int k = 6;
		System.out.println(maxLength(a, k));
	}
}
