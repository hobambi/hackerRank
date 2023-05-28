import java.util.Stack;

public class STR {

	public static String getFinalString(String s) {

		while (s.length() > 2) {
			boolean str = false;
			if(s.contains("STR")) {
				s = s.replaceFirst("STR","");
				str = true;
			}
			if(str == false) break;
		}
		if(s.isEmpty()) return "-1";

		return s;
	}

	public static void main(String[] args) {
		String result = getFinalString("STR");
		System.out.println("result = " + result);
	}
}
