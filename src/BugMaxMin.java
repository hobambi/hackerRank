public class BugMaxMin {

	public static long findRange(int num) {
		long answer = 0;
		char maxNum = 0;
		char minNum = 0;
		long max = 0;
		long min = 0;
		String s = String.valueOf(num);
		char[] arr = s.toCharArray();

		// boolean change = false;
		for (int i = 0; i < arr.length; i++) { // 최댓값 구하기
			if(arr[i] != '9') {
				maxNum = arr[i];
				// change = true;
				break;
			}
		}

		String maxString = "";

		for (int i = 0; i < arr.length; i++) { // 최댓값 구하기
			maxString = s.replace(maxNum, '9');
		}
		max = Integer.parseInt(maxString);

		// change = false;
		for (int i = 0; i < arr.length; i++) { // 최솟값 구하기
			if(arr[i] != '1' && i == 0) {
				minNum = arr[0];
				// change = true;
				break;
			}
			if(arr[i] != '0' && arr[i] != arr[0]) {
				minNum = arr[i];
				break;
			}
		}

		String minString = s.replace(minNum,'0');
		min = Integer.parseInt(minString);

		answer = max-min;

		return answer;
	}

	public static void main(String[] args) {
		long result = findRange(123512);
		System.out.println("result = " + result);
	}
}
