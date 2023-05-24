import static java.util.stream.Collectors.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CountingSort1 {

	public static List<Integer> countingSort(List<Integer> arr) {
		// Write your code here
		Integer[] intArr = new Integer[100];
		for (int i = 0; i < 100; i++) {
			intArr[i] = 0;
		}

		for (Integer i : arr) {
			intArr[i]++;
		}
		List<Integer> answer = Arrays.asList(intArr);

		return answer;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
			.map(Integer::parseInt)
			.collect(toList());

		List<Integer> result = countingSort(arr);
		System.out.println("result = " + result);


		bufferedReader.close();
	}
}
