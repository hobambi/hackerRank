import java.util.Arrays;

public class FlippingBits {
	public static long flippingBits(long n) {
		// Write your code here
		String binary = Long.toBinaryString(n);
		int[] bits = new int[32];
		for (int i = binary.length()-1, j =31; i >=0; i--,j--) {
			bits[j] = binary.charAt(i)-'0';
		}

		String s = "";
		for (int i = 0; i < 32; i++) {
			if(bits[i] == 0) bits[i] = 1;
			else bits[i] = 0;
			s += bits[i];
		}

		Long answer = Long.parseLong(s,2);
		return answer;
	}

	public static void main(String[] args) {
		Long k = flippingBits(2147483647 );
		System.out.println("k = " + k);
	}
}
