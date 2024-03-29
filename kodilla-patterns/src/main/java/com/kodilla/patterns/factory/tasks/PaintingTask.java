package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{
    private String taskName;
    private String color;
    private String whatToPaint;
    private boolean isTaskExecuted;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String getTaskName(){
        return taskName;
    }

    @Override
    public void executeTask(){
        System.out.println("Task is executed.");
        isTaskExecuted = true;
    }

    @Override
    public boolean isTaskExecuted(){
        return isTaskExecuted;
    }
}
