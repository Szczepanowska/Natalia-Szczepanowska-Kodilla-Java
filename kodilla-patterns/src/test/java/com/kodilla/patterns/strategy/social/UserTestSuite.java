package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.Customer;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void UserTestSuite(){
        User user1 = new Millenials("John");
        User user2 = new YGeneration("Bob");
        User user3 = new ZGeneration("Markus");

        String johnPost = user1.publish();
        System.out.println("John will publish it on: " + johnPost);
        String bobPost = user2.publish();
        System.out.println("Bob will publish it on: " + bobPost);
        String markusPost = user3.publish();
        System.out.println("Markus will publish it on: " + markusPost);

        Assert.assertEquals("Facebook", johnPost);
        Assert.assertEquals("Twitter", bobPost);
        Assert.assertEquals("Snapchat", markusPost);

    }

    @Test
    public void testIndividualSharingStrategy(){
        User user0 = new Millenials("John");

        String johnPost = user0.publish();
        System.out.println("John will publish it on: " + johnPost);
        user0.sharePost(new TwitterPublisher());
        johnPost = user0.publish();
        System.out.println("John will publish it on: " + johnPost);

        Assert.assertEquals("Twitter", johnPost);
    }
}
