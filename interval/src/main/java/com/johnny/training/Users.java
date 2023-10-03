package com.johnny.training;

import java.util.ArrayList;

public class Users {
    private String userName;
    private String password;
    private int ID;
    private ArrayList<Tweet> listOfTweets;
    public Users(){
        this.listOfTweets = new ArrayList<>();
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public ArrayList<Tweet> getListOfTweets() {
        return this.listOfTweets;
    }

    public void setListOfTweets(Tweet t) {
        this.listOfTweets.add(t);
    }


}
