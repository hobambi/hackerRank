// https://www.hackerrank.com/challenges/one-week-preparation-kit-caesar-cipher-1/problem?h_l=interview&isFullScreen=true&playlist_slugs%5B%5D%5B%5D=preparation-kits&playlist_slugs%5B%5D%5B%5D=one-week-preparation-kit&playlist_slugs%5B%5D%5B%5D=one-week-day-three
public class CaesarCipher {

	/*
	k가 26보다 커질 경우를 생각! -> k의 나머지로!
	 */

	public static String caesarCipher(String s, int k) {
		// Write your code here
		String answer = "";
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c >= 65 && c <= 90-k%26) answer += (char)(s.charAt(i)+k%26);
			else if(c >= 97 && c <= 122-k%26) answer += (char)(s.charAt(i)+k%26);
			else if(c > 90-k%26 && c <= 90) answer += (char)(s.charAt(i)+k%26-26);
			else if(c > 122-k%26 && c <= 122) answer += (char)(s.charAt(i)+k%26-26);
			else answer += s.charAt(i);
		}
		return answer;
	}
}
