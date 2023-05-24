import java.text.SimpleDateFormat;

public class TimeConversion {

	public static String timeConversion(String s) {
		// Write your code here
		String[] arr = s.split(":");
		String ampm = arr[2].substring(2);
		if(ampm.equals("PM")) arr[0] = String.valueOf(Integer.parseInt(arr[0])+ 12);
		if(arr[0].equals("12")) arr[0] = "00";
		else if(arr[0].equals("24")) arr[0] = "12";
		String answer = arr[0] +":" + arr[1] + ":" +arr[2].substring(0,2);
		return answer;
	}

	public static void main(String[] args) {
		String s = "12:05:45AM";
		String result = timeConversion(s);
		System.out.println("result = " + result);
	}
}