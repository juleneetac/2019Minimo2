package edu.upc.dsa.models;

public class User {
    String nickname;
    String password;

    public User(String name, String password) {
        this.nickname = name;
        this.password = password;
    }

    public void setNick(String nick) {
        this.nickname = nick;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNick() {
        return nickname;
    }

    public String getPassword() {
        return password;
    }

    public User(){}
}
