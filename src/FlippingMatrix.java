import static java.util.stream.Collectors.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlippingMatrix {


	public static int flippingMatrix(List<List<Integer>> matrix) {
		// Write your code here
		int answer = 0;
		int size = matrix.size();
		for (int i = 0; i < (size/2); i++) {
			for (int j = 0; j < size/2; j++) {
				List<Integer> four = new ArrayList<>();
				four.add(matrix.get(i).get(j));
				four.add(matrix.get(size-1-i).get(j));
				four.add(matrix.get(i).get(size-1-j));
				four.add(matrix.get(size-i-1).get(size-1-j));
				Collections.sort(four);
				answer += four.get(3);
			}
		}
		return answer;
	}


	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int q = Integer.parseInt(bufferedReader.readLine().trim());

		IntStream.range(0, q).forEach(qItr -> {
			try {
				int n = Integer.parseInt(bufferedReader.readLine().trim());

				List<List<Integer>> matrix = new ArrayList<>();

				IntStream.range(0, 2 * n).forEach(i -> {
					try {
						matrix.add(
							Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
								.map(Integer::parseInt)
								.collect(toList())
						);
					} catch (IOException ex) {
						throw new RuntimeException(ex);
					}
				});

				int result = flippingMatrix(matrix);
				System.out.println("result = " + result);


			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		bufferedReader.close();
	}

}
