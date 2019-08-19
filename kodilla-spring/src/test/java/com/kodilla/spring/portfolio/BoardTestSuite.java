package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        TaskList toDoList = board.getToDoList();
        TaskList inProgressList = board.getInProgressList();
        TaskList doneList = board.getDoneList();

        toDoList.addTaskToTheList("Check out");
        inProgressList.addTaskToTheList("Solve the task");
        doneList.addTaskToTheList("Read the manual");
        // When
        String toDoTask = toDoList.getTaskFromTheList(0);
        String inProgressTask = inProgressList.getTaskFromTheList(0);
        String doneTask = doneList.getTaskFromTheList(0);

        //Then
        Assert.assertEquals("Check out", toDoTask);
        Assert.assertEquals("Solve the task", inProgressTask);
        Assert.assertEquals("Read the manual", doneTask);
    }
}
