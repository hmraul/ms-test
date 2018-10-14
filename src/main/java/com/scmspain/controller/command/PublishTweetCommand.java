package com.scmspain.controller.command;

import org.springframework.util.StringUtils;

public class PublishTweetCommand extends TweetCommand{
    private String publisher;
    private String tweet;

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getTweet() {
        return tweet;
    }

    public void setTweet(String tweet) {
        this.tweet = tweet;
    }

    @Override
    public void validate() {
        if (StringUtils.isEmpty(publisher)) {
            notification.addError("Empty publisher");
        }
        if (StringUtils.isEmpty(tweet)) {
            notification.addError("Empty tweet");
        }
        if (tweet.length() > 140) {
            notification.addError("Tweet too long");
        }
    }
}
