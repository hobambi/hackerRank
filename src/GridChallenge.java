import static java.util.stream.Collectors.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

// https://www.hackerrank.com/challenges/one-week-preparation-kit-grid-challenge/problem?h_l=interview&isFullScreen=true&playlist_slugs%5B%5D%5B%5D=preparation-kits&playlist_slugs%5B%5D%5B%5D=one-week-preparation-kit&playlist_slugs%5B%5D%5B%5D=one-week-day-four
public class GridChallenge {

	public static String gridChallenge(List<String> grid) {
		// Write your code here
		for(int i = 0; i < grid.size(); i++) {
			char[] sortChar = grid.get(i).toCharArray();
			Arrays.sort(sortChar);
			String sortString = new String(sortChar);
			grid.set(i,sortString);
		}
		boolean out = false;
		for(int i = 0; i < grid.get(0).length(); i++) {
			String sero = "";
			for(int j = 0; j < grid.size(); j++) {
				sero += grid.get(j).charAt(i);
			}
			System.out.println("sero = " + sero);
			char[] sortChar = sero.toCharArray();
			Arrays.sort(sortChar);
			String sorString = new String(sortChar);
			System.out.println("sorString = " + sorString);
			if(!sorString.equals(sero)) {
				return "NO";
			}
		}
		return "YES";
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(bufferedReader.readLine().trim());

		IntStream.range(0, t).forEach(tItr -> {
			try {
				int n = Integer.parseInt(bufferedReader.readLine().trim());

				List<String> grid = IntStream.range(0, n).mapToObj(i -> {
						try {
							return bufferedReader.readLine();
						} catch (IOException ex) {
							throw new RuntimeException(ex);
						}
					})
					.collect(toList());

				String result = gridChallenge(grid);
				System.out.println("result = " + result);


			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		bufferedReader.close();
	}
}
