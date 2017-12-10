package com.sda.service;


import com.sda.model.Tweet;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MyTwitterService {
    private static MyTwitterService _instance;

    private List<Tweet> myTweetList;

    private MyTwitterService() {
        myTweetList = new LinkedList<Tweet>();
    }

    /**
     * Method singleton, creat instance MyTwitterService
     *
     * @return
     */
    public static MyTwitterService getInstance() {
        if (_instance == null) {
            _instance = new MyTwitterService();
        }
        return _instance;
    }
    public void  addTweet(Tweet tweet){
        myTweetList.add(tweet);
    }

    public List<Tweet> getMyTweetList(){
        return Collections.unmodifiableList(myTweetList);
    }
}
