package org.example.ClientService;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    private static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    private static final Pattern VALID_PASSWORD =
            Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+.=!])(?=\\S+$).{8,}$", Pattern.CASE_INSENSITIVE);
    private static final Pattern PHONE_NUMBER_PATTERN =
            Pattern.compile("^\\+7(?:\\(\\d{3}\\)|\\d{3})\\d{7}$", Pattern.CASE_INSENSITIVE);

    static boolean validateEmail(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.matches();
    }

    static boolean validatePassword(String password) {
        Matcher matcher = VALID_PASSWORD.matcher(password);
        return matcher.matches();
    }

    static boolean validatePhoneNumber(String phoneNumber) {
        Matcher matcher = PHONE_NUMBER_PATTERN.matcher(phoneNumber);
        return matcher.matches();
    }
}