import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.hackerrank.com/challenges/one-week-preparation-kit-recursive-digit-sum/problem?h_l=interview&isFullScreen=true&playlist_slugs%5B%5D%5B%5D=preparation-kits&playlist_slugs%5B%5D%5B%5D=one-week-preparation-kit&playlist_slugs%5B%5D%5B%5D=one-week-day-four
public class SuperDigit {
	/*
	repeat는 java 11 에서 나온 함수라서 java 8로는 못 풂
	이건 repeat없이 풀 수 있음, 아니 그게 나음
	어차피 자리수의 합이기 때문에 기본 자리수의 합을 구한 다음 곱하기 k하면 됨
	제한 조건에 n과 k가 크므로 long을 사용해야 함.
	 */

	public static int superDigit(String n, int k) {
		// Write your code here
		char[] c = n.toCharArray();
		long temp = 0;
		for (int i = 0; i < c.length; i++) {
			temp += (c[i]-'0');
		}
		n = String.valueOf(temp*k);

		while(n.length() > 1) {
			c = n.toCharArray();
			temp = 0;
			for (int i = 0; i < c.length; i++) {
				temp += (c[i]-'0');
			}
			n = String.valueOf(temp);
			if(n.length()==1) break;
		}

		return Integer.parseInt(n);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		String n = firstMultipleInput[0];

		int k = Integer.parseInt(firstMultipleInput[1]);

		int result = superDigit(n, k);
		System.out.println("result = " + result);

		bufferedReader.close();
	}
}
