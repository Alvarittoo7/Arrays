package arrays1;

public class arrays3 {

	public static String inReverse (int [] values) {
		String message = "";
		for(int i=(values.length-1); i>=0; i--) {
			message += values[i];
			message += " ";
		}
		return message;
	}
}
