package kz.petsclinic.models;

/**
 * user model
 */
public class User {
    private int id;
    private String login;
    private String email;

    public User(final int id, final String login, final String email) {
        this.id = id;
        this.login = login;
        this.email = email;
    }

    public String getLogin() {
        return this.login;
    }

    public String getEmail() {
        return this.email;
    }

    public int getId() {
        return id;
    }

}
