package com.johnny.training;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Users johnny = new Users();
        johnny.setID(1111);
        johnny.setPassword("NicoleAntoun");
        johnny.setUserName("johnnylion");
        Tweet tweet1 = new Tweet();
        tweet1.setDescription("Bob fet aa lyst ");
        tweet1.setTweetID(0002);
        Tweet tweet2 = new Tweet();
        tweet2.setDescription("wwwgoogle.com ");
        tweet2.setTweetID(0001);
        Tweet tweet3 = new Tweet();
        tweet3.setDescription("Bob gay ");
        tweet3.setTweetID(0003);
        tweet3.setDateOfTweet(LocalDate.now());
        Twitter t = new Twitter();
        t.postTweet(johnny , tweet1);
        t.postTweet(johnny , tweet2);
        t.postTweet(johnny , tweet3);
        t.userTweets(johnny);





    }
}


