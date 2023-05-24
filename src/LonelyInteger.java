import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LonelyInteger {

	public static int lonelyinteger(List<Integer> a) {
		// Write your code here
		int answer;
		HashMap<Integer,Integer> map = new HashMap<>();
		for(Integer i : a) {
			if(map.containsKey(i)) map.remove(i);
			else map.put(i, i);
		}
		String z = map.values().toString();
		answer = Integer.parseInt(z.replaceAll("[^0-9]",""));
		return answer;
	}

	public static void main(String[] args) {

		List<Integer> a = new ArrayList<>(Arrays.asList(1,2,3,4,3,2,1));
		System.out.println("lonelyinteger(a) = " + lonelyinteger(a));
	}
}
