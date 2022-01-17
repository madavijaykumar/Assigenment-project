import java.util.regex.Pattern;

public class StringRegularExpression {
	public static void main(String[] args) {
		System.out.println(Pattern.matches("Good","Good"));
		System.out.println(
				Pattern.matches("Good","good"));
	}

}
