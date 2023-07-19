
public class Main {
    public static void main(String[] args) {
        try {
            AuthenticationValidator.checkAuthentication("login", "pass", "pass");
        } catch
        (WrongLoginException ex) {
            System.out.println(ex.getMessage());
        } catch (WrongPasswordException ex1) {
            System.out.println(ex1.getMessage());
        }
    }
}