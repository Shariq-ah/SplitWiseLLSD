package org.example;

import java.util.List;

public class Users {

    private List<User> userList;

    public Users(List<User> userList) {
        this.userList = userList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userList=" + userList +
                '}';
    }
}
