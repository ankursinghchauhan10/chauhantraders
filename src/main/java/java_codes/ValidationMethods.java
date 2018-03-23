package java_codes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationMethods {
	static Pattern pattern;
	static Matcher matcher;

	// email validator
	public static boolean emailValidator(final String mailAddress) {

		final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

		pattern = Pattern.compile(EMAIL_PATTERN);
		matcher = pattern.matcher(mailAddress);
		return matcher.matches();

	}

	// isAlphabet
	public static boolean isAlphabet(String dateToValidate) {

		final String PATTERN = "^\\p{L}+[\\p{L}\\p{Z}\\p{P}]{0,}";

		pattern = Pattern.compile(PATTERN);
		matcher = pattern.matcher(dateToValidate);
		return matcher.matches();
	}

	// isMobileNumber
	public static boolean isMobileNumber(String dateToValidate) {
		final String Mobile_PATTERN = "^[0-9]{10}";

		pattern = Pattern.compile(Mobile_PATTERN);
		matcher = pattern.matcher(dateToValidate);
		return matcher.matches();
	}

}