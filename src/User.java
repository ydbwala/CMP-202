public class User {
    String username = "Don";
    String password = "Password";
    String login() {
        if (username.equals("Don") && password.equals("Password")) {
            return "Logged in";
        } else{
            return "Failed";
        }
    }
    public static void main(String[]args) {
        User Jane = new User();
        System.out.println(Jane.login());
    }
}