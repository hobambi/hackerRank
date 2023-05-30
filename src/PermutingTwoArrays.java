import java.util.Collections;
import java.util.List;

public class PermutingTwoArrays {

	// https://www.hackerrank.com/challenges/one-month-preparation-kit-two-arrays/problem?h_l=interview&isFullScreen=true&playlist_slugs%5B%5D%5B%5D=preparation-kits&playlist_slugs%5B%5D%5B%5D=one-month-preparation-kit&playlist_slugs%5B%5D%5B%5D=one-month-week-one
	public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
		// Write your code here
		Collections.sort(A);
		Collections.sort(B, Collections.reverseOrder());
		boolean yes = true;
		for (int i = 0; i < A.size(); i++) {
			if(A.get(i)+B.get(i) < k) {
				yes = false;
				break;
			}
		}
		if(yes) return "YES";
		else return "NO";
	}
}
