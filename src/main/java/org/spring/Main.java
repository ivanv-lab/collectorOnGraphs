package org.spring;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Task> graph=new ArrayList<>();
        graph=new Task().createGraph(15);

        for(Task task:graph){
            System.out.println(task.getLog());
        }

    }
}