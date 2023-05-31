import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringChain {

	public static int longestChain(List<String> words) {
		int answer = 1;

		if(words.size()==0 || words.size()==1) {
			return words.size();
		}

		Collections.sort(words);

		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i < words.size(); i++) {
			String base = words.get(i);
			map.put(base,1);

			for (int j = 0; j < base.length(); j++) {
				StringBuilder sb = new StringBuilder(base);
				sb.deleteCharAt(j);
				String minusOne = sb.toString();

				if(!map.containsKey(minusOne)) continue;
				map.put(base,Math.max(map.get(base),map.get(minusOne)+1));
			}
			answer = Math.max(answer, map.getOrDefault(base, 1));
		}

		return answer;
	}

	public static void main(String[] args) {

		List<String> words = Arrays.asList("a", "b", "ba", "bca", "bda", "bdca");
		int result = longestChain(words);
		System.out.println("result = " + result);
	}
}
