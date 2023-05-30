public class Pangram {

	public static String pangrams(String s) {
		// Write your code here
		boolean pangram = true;
		s = s.toLowerCase();

		for (int i = 97; i <= 122; i++) {
			if(!s.contains(Character.toString((char)i))) {
				pangram = false;
				break;
			}
		}
		if(pangram) return "pangram";
		else return "not pangram";

	}
}
