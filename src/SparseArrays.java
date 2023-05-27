import static java.util.stream.Collectors.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
// https://www.hackerrank.com/challenges/one-month-preparation-kit-sparse-arrays/problem?h_l=interview&isFullScreen=true&playlist_slugs%5B%5D%5B%5D=preparation-kits&playlist_slugs%5B%5D%5B%5D=one-month-preparation-kit&playlist_slugs%5B%5D%5B%5D=one-month-week-one
public class SparseArrays {
	public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
		// Write your code here
		Integer[] answer = new Integer[queries.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = 0;
		}


		for (int i = 0; i < queries.size(); i++) {
			for (int j = 0; j < strings.size(); j++) {
				if(strings.get(j).equals(queries.get(i))) {
					answer[i]++;
				}
			}
		}

		return Arrays.asList(answer);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int stringsCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<String> strings = IntStream.range(0, stringsCount).mapToObj(i -> {
				try {
					return bufferedReader.readLine();
				} catch (IOException ex) {
					throw new RuntimeException(ex);
				}
			})
			.collect(toList());

		int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<String> queries = IntStream.range(0, queriesCount).mapToObj(i -> {
				try {
					return bufferedReader.readLine();
				} catch (IOException ex) {
					throw new RuntimeException(ex);
				}
			})
			.collect(toList());

		List<Integer> res = matchingStrings(strings, queries);
		System.out.println("res = " + res);


		bufferedReader.close();
	}
}
