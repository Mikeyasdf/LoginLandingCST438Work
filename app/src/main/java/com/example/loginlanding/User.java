package com.example.loginlanding;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {

    @PrimaryKey(autoGenerate = true)
    private int userID;

    private String username;

    private String password;

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    public User(){

    }

    public int getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
