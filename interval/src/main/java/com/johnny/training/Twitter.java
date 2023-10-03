package com.johnny.training;

import java.util.ArrayList;
import java.util.List;

public class Twitter {
    private Tweet tweet;
    private Users user;

    Twitter(){



    }


    public void postTweet(Users u, Tweet t) {

        u.setListOfTweets(t);
        System.out.println("Tweet added successfully");

    }
    public void userTweets (Users u){
        System.out.println("The user " + u.getUserName() + " has the following tweets ");
        for (Tweet t : u.getListOfTweets())
        {
            System.out.println("Tweet ID " + t.getTweetID());
            System.out.println("Tweet Description " + t.getDescription());
            System.out.println("Tweet Date " + t.getDateOfTweet());
        }
    }


    public List<Integer> getNewsFeed(int userId) {

       return null;

    }



    public void follow(int followerId, int followeeId) {



    }



    public void unfollow(int followerId, int followeeId) {



    }


}
