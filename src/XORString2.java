import java.util.Scanner;

/* *
왜 인지 모르겠으나, java7에만 기본 코드가 있고, java8과 java15에는 아무 코드도 없음
아래 코드는 java7로 푼 것 - 부분적으로 틀린 부분이 있고, 이를 고치면 된다.
https://www.hackerrank.com/challenges/one-month-preparation-kit-strings-xor/problem?h_l=interview&isFullScreen=true&playlist_slugs%5B%5D%5B%5D=preparation-kits&playlist_slugs%5B%5D%5B%5D=one-month-preparation-kit&playlist_slugs%5B%5D%5B%5D=one-month-week-one
 */
public class XORString2 {

	public static String stringsXOR(String s, String t) {
		String res = new String("");
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != t.charAt(i))
				res += "1";
			else
				res += "0";
		}

		return res;
	}

	public static void main(String[] args) {

		String s, t;
		Scanner in = new Scanner(System.in);
		s = in.nextLine();
		t = in.nextLine();
		System.out.println(stringsXOR(s, t));

	}
}
