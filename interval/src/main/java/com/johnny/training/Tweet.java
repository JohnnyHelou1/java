package com.johnny.training;

import java.time.LocalDate;
import java.util.Date;

public class Tweet {
    private int tweetID;
    private String description;
    private LocalDate dateOfTweet;
    public Tweet() {}

    public int getTweetID() {
        return tweetID;
    }

    public void setTweetID(int tweetID) {
        this.tweetID = tweetID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateOfTweet() {
        return this.dateOfTweet;
    }

    public void setDateOfTweet(LocalDate dateOfTweet) {
        this.dateOfTweet = dateOfTweet;
    }
}
