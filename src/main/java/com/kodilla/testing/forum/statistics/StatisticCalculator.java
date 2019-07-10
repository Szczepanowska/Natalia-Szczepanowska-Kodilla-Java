package com.kodilla.testing.forum.statistics;

public class StatisticCalculator {


    int numberOfUsers = 0;

    int numberOfPosts = 0;

    int numberOfComments = 0;

    double averageNumberOfPostPerUser = 0;

    double averageNumberOfCommentsPerUser = 0;

    double averageNumberOfCommentsPerPost = 0;

    public int getNumberOfUsers(){
        return numberOfUsers;
    }

    public int getNumberOfPosts(){
        return numberOfPosts;
    }

    public int getNumberOfComments(){
        return numberOfComments;
    }

    public double getAverageNumberOfPostPerUser(){
        return averageNumberOfPostPerUser;
    }

    public double getAverageNumberOfCommntsPerUser() {
        return averageNumberOfCommentsPerUser;
    }

    public double getAverageNumberOfCommentsPerPost() {
        return averageNumberOfCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {

        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();

        if (numberOfUsers > 0) {
            averageNumberOfPostPerUser = (double) numberOfPosts / (double) numberOfUsers;
            averageNumberOfCommentsPerUser = (double) numberOfComments / (double) numberOfUsers;
        }

        if (numberOfPosts > 0) {
            averageNumberOfCommentsPerPost = (double) numberOfComments / (double) numberOfPosts;
        }
    }

    public void showStatistics(){
        System.out.println("Number of users is: " + numberOfUsers);
        System.out.println("Number of posts is: " + numberOfPosts);
        System.out.println("Number of comments is: " + numberOfComments);
        System.out.println("Average number of posts per user is: " + averageNumberOfPostPerUser);
        System.out.println("Average number of comments per user is: " + averageNumberOfCommentsPerUser);
        System.out.println("Average number of comments per post is: " + averageNumberOfCommentsPerPost);

    }
}
