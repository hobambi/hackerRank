
// https://www.hackerrank.com/challenges/one-week-preparation-kit-tower-breakers-1/problem?h_l=interview&isFullScreen=true&playlist_slugs%5B%5D%5B%5D=preparation-kits&playlist_slugs%5B%5D%5B%5D=one-week-preparation-kit&playlist_slugs%5B%5D%5B%5D=one-week-day-three
public class TowerBreakers {

	public static int towerBreakers(int n, int m) {
		// Write your code here
		if(n == 1) return 1;
		if(m == 1) return 2;
		if(n % 2 == 0) return 2;
		else return 1;

	}


}
