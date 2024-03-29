package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void addTaskToTheList(String task) {
        tasks.add(task);
    }

    public String getTaskFromTheList(int index) {
        return tasks.get(index);
    }
}
