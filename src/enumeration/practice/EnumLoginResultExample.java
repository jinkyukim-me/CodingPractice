package enumeration.practice;

public class EnumLoginResultExample {
    public static void main(String[] args) {

        LoginResult result = LoginResult.FAIL_PASSWORD;
        if(result == LoginResult.SUCCESS) {
            System.out.println(LoginResult.SUCCESS);
        }
        else if(result == LoginResult.FAIL_ID) {
            System.out.println(LoginResult.FAIL_ID);
        }
        else if(result == LoginResult.FAIL_PASSWORD) {
            System.out.println(LoginResult.FAIL_PASSWORD);
        }
    }
}
