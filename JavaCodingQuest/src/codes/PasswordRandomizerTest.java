package codes;

public class PasswordRandomizerTest {

      public static void main(String[] args) {

            PasswordRandomizer randomPassword = new PasswordRandomizer(13);

            System.out.println("Password: " + randomPassword.createPassword());
            System.out.println("Password: " + randomPassword.createPassword());
            System.out.println("Password: " + randomPassword.createPassword());
            System.out.println("Password: " + randomPassword.createPassword());
            System.out.println("Password: " + randomPassword.createPassword());
      }
}
