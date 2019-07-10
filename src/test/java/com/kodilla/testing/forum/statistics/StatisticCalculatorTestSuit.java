package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticCalculatorTestSuit {

    @Test
    public void calculateAdvStatistics1() {
        Statistics statisticsMock = mock(Statistics.class);
        StatisticCalculator calculator = new StatisticCalculator();

        calculator.calculateAdvStatistics(statisticsMock);
        calculator.showStatistics();

        Assert.assertEquals(0, calculator.getNumberOfUsers());
        Assert.assertEquals(0, calculator.getNumberOfPosts());
        Assert.assertEquals(0, calculator.getNumberOfComments());
        Assert.assertEquals(0, calculator.getAverageNumberOfPostPerUser(), 0);
        Assert.assertEquals(0, calculator.getAverageNumberOfCommentsPerPost(), 0);
        Assert.assertEquals(0, calculator.getAverageNumberOfCommntsPerUser(), 0);

    }

    @Test
    public void calculateAdvStatistics2() {
        Statistics statisticsMock = mock(Statistics.class);
        StatisticCalculator calculator = new StatisticCalculator();

        ArrayList<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("Name");
        }

        when(statisticsMock.usersNames()).thenReturn(usersNames);

        calculator.calculateAdvStatistics(statisticsMock);
        calculator.showStatistics();

        Assert.assertEquals(100, calculator.getNumberOfUsers());
        Assert.assertEquals(0, calculator.getNumberOfPosts());
        Assert.assertEquals(0, calculator.getNumberOfComments());
        Assert.assertEquals(0, calculator.getAverageNumberOfPostPerUser(), 0);
        Assert.assertEquals(0, calculator.getAverageNumberOfCommentsPerPost(), 0);
        Assert.assertEquals(0, calculator.getAverageNumberOfCommntsPerUser(), 0);

    }

    @Test
    public void calculateAdvStatistics3() {
        Statistics statisticsMock = mock(Statistics.class);
        StatisticCalculator calculator = new StatisticCalculator();

        ArrayList<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("Name");
        }

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(1000);

        calculator.calculateAdvStatistics(statisticsMock);
        calculator.showStatistics();

        Assert.assertEquals(100, calculator.getNumberOfUsers());
        Assert.assertEquals(1000, calculator.getNumberOfPosts());
        Assert.assertEquals(0, calculator.getNumberOfComments());
        Assert.assertEquals(10, calculator.getAverageNumberOfPostPerUser(), 0);
        Assert.assertEquals(0, calculator.getAverageNumberOfCommentsPerPost(), 0);
        Assert.assertEquals(0, calculator.getAverageNumberOfCommntsPerUser(), 0);

    }

    @Test
    public void calculateAdvStatistics4() {
        Statistics statisticsMock = mock(Statistics.class);
        StatisticCalculator calculator = new StatisticCalculator();

        ArrayList<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("Name");
        }

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(10);

        calculator.calculateAdvStatistics(statisticsMock);
        calculator.showStatistics();

        Assert.assertEquals(100, calculator.getNumberOfUsers());
        Assert.assertEquals(1000, calculator.getNumberOfPosts());
        Assert.assertEquals(10, calculator.getNumberOfComments());
        Assert.assertEquals(10, calculator.getAverageNumberOfPostPerUser(), 0);
        Assert.assertEquals(0.01, calculator.getAverageNumberOfCommentsPerPost(), 0);
        Assert.assertEquals(0.1, calculator.getAverageNumberOfCommntsPerUser(), 0);

    }

    @Test
    public void calculateAdvStatistics5() {
        Statistics statisticsMock = mock(Statistics.class);
        StatisticCalculator calculator = new StatisticCalculator();

        ArrayList<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("Name");
        }

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(5000);

        calculator.calculateAdvStatistics(statisticsMock);
        calculator.showStatistics();

        Assert.assertEquals(100, calculator.getNumberOfUsers());
        Assert.assertEquals(1000, calculator.getNumberOfPosts());
        Assert.assertEquals(5000, calculator.getNumberOfComments());
        Assert.assertEquals(10, calculator.getAverageNumberOfPostPerUser(), 0);
        Assert.assertEquals(5, calculator.getAverageNumberOfCommentsPerPost(), 0);
        Assert.assertEquals(50, calculator.getAverageNumberOfCommntsPerUser(), 0);

    }

}




