import java.util.List;

// https://www.hackerrank.com/challenges/one-month-preparation-kit-the-birthday-bar/problem?h_l=interview&isFullScreen=true&playlist_slugs%5B%5D%5B%5D=preparation-kits&playlist_slugs%5B%5D%5B%5D=one-month-preparation-kit&playlist_slugs%5B%5D%5B%5D=one-month-week-one
public class SubArrayDivision {

	public static int birthday(List<Integer> s, int d, int m) {
		// Write your code here
		int answer = 0;
		int sum = 0;

		for (int i = 0; i < s.size(); i++) {
			sum += s.get(i);

			if(i >= m) sum -= s.get(i - m);
			if(sum == d && i >= m -1) answer++;
		}

		return answer;
	}
}
