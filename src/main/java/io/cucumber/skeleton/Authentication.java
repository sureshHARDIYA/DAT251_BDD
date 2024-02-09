package io.cucumber.skeleton;

public class Authentication {
    private final String username;
    private final String password;

    public Authentication(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String logIn() {
        boolean validUser = "Bob".equals(this.username) && "tester".equals(this.password);

        System.out.println(this.username);

        if (validUser) {
            return this.greeting("Welcome " + this.username);
        }

        return this.greeting("Invalid credentials");
    }

    private String greeting(String msg) {
        return msg;
    }
}
