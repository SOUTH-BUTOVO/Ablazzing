package ru.Ablazzing.lesson12_HashMap_HashSet.task94;

import java.util.Objects;

public class User {

    String login;
    String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login);
//        return this.login.hashCode();
    }

    @Override
    public String toString() {
        return "User {" + "login - '" + login + '\'' + ", password - '" + password + '\'' + '}';
    }
}
