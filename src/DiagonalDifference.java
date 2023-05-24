import static java.util.stream.Collectors.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DiagonalDifference {

	public static int diagonalDifference(List<List<Integer>> arr) {
		// Write your code here
		int answer = 0;
		int left = 0;
		int right = 0;

		for(int i = 0; i < arr.size(); i++) {
			left += arr.get(i).get(i);
			right += arr.get(i).get(arr.size()-i-1);
		}
		System.out.println("left = " + left);
		System.out.println("right = " + right);
		answer = Math.abs(left-right);
		return answer;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<List<Integer>> arr = new ArrayList<>();

		IntStream.range(0, n).forEach(i -> {
			try {
				arr.add(
					Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
						.map(Integer::parseInt)
						.collect(toList())
				);
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		int result = diagonalDifference(arr);

		System.out.println("String.valueOf(result) = " + String.valueOf(result));
		bufferedReader.close();
	}
}
