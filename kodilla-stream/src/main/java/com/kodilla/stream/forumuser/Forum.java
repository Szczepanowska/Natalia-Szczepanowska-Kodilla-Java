package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;


public final class Forum {
    private final List<ForumUser> theList = new ArrayList<>();

    public Forum() {
        theList.add(new ForumUser(001, "Name1", 'M', 2009, 11, 15, 5));
        theList.add(new ForumUser(002, "Name2", 'M', 1998, 2, 23, 812));
        theList.add(new ForumUser(003, "Name3", 'F', 1998, 1, 14, 212));
        theList.add(new ForumUser(004, "Name4", 'F', 1978, 1, 15, 21));
        theList.add(new ForumUser(005, "Name5", 'M', 1978, 6, 16, 21));

    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theList);
    }
}
