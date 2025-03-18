package org.spring;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class Task {
    int n;
    Task next;
    Task prev;
    String log;

    public Task(){}

    public Task(int value, Task prev, Task next) {
        this.n=value;
        this.prev = prev;
        this.next = next;
        this.log="Выполнена задача сборки номер "+n;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Task getNext() {
        return next;
    }

    public void setNext(Task next) {
        this.next = next;
    }

    public Task getPrev() {
        return prev;
    }

    public void setPrev(Task prev) {
        this.prev = prev;
    }

    public List<Task> createGraph(int taskCount){
        Random random=new Random();
        List<Task> graph=new ArrayList<>();
        Task nullTask=new Task(0,null,null);
        Task firstTask=new Task(1,nullTask,null);
        graph.add(nullTask);
        graph.add(firstTask);
        for(int i=2;i<taskCount;i++){
            graph.add(new Task(i,graph.get(random.nextInt(0,i)),null));
        }

        return graph;
    }
}
