package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testShoppingTask(){
        TaskFactory factory = new TaskFactory();
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPINGTASK);
        shoppingTask.executeTask();

       Assert.assertEquals(shoppingTask.getTaskName(), "grocery");
        Assert.assertTrue(shoppingTask.isTaskExecuted());
    }

    @Test
    public void testPaintingTask(){
        TaskFactory factory = new TaskFactory();
        Task paintingTask = factory.makeTask(TaskFactory.PAINTINGTASK);
        paintingTask.executeTask();

        Assert.assertEquals(paintingTask.getTaskName(), "renovation");
        Assert.assertTrue(paintingTask.isTaskExecuted());
    };

    @Test
    public void testDrivingTask(){
        TaskFactory factory = new TaskFactory();
        Task drivingTask = factory.makeTask(TaskFactory.DRIVINGTASK);
        drivingTask.executeTask();

        Assert.assertEquals(drivingTask.getTaskName(), "afternoon ride");
        Assert.assertTrue(drivingTask.isTaskExecuted());
    }
}
