package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task makeTask(final String taskClass){
        switch (taskClass){
            case SHOPPINGTASK:
                return new ShoppingTask("grocery", "milk", 2.0);
            case PAINTINGTASK:
                return new PaintingTask("renovation", "mint", "living room");
            case DRIVINGTASK:
                return new DrivingTask("afternoon ride", "Olimpic Park", "bike");
            default:
                return null;
        }

    }
}
