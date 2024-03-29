package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;

public class BoardConfig {


    public TaskList getToDoList() {
        return new TaskList();
    }


    public TaskList getInProgressList() {
        return new TaskList();
    }


    public TaskList getDoneList() {
        return new TaskList();
    }


    public Board board() {
        return new Board(getToDoList(), getInProgressList(), getDoneList());
    }
}
