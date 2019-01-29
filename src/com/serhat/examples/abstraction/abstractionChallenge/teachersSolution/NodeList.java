package com.serhat.examples.abstraction.abstractionChallenge.teachersSolution;

public interface NodeList {
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);
}