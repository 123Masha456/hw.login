import java.util.regex.Pattern;

public class AuthenticationValidator {
    private static final Pattern REGEX = Pattern.compile("[A-Za-z0-9_]{0,20}");

    public static void checkAuthentication(String login, String password, String confirmedPassword) throws
            WrongLoginException, WrongPasswordException {
        checkLogin(login);
        checkPassword(password);
        checkConfirmedPassword(password, confirmedPassword);
    }

    private static void checkLogin(String login) throws WrongLoginException {
        if (!login.matches(REGEX.pattern())) {
            throw new WrongLoginException("Login должен содержать в себе только латинские буквы, " +
                    "цифры и знак подчеркивания, а также должен быть равен или меньше 20 символов ");
        }
    }

    private static void checkPassword(String password) throws WrongPasswordException {
        if (!password.matches(REGEX.pattern())) {
            throw new WrongPasswordException("Login должен содержать в себе только латинские буквы, " +
                    "цифры и знак подчеркивания, а также должен быть равен или меньше 20 символов ");
        }
    }

    private static void checkConfirmedPassword(String password, String confirmedPassword)
            throws WrongPasswordException {
        if (!password.equals(confirmedPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }
}

