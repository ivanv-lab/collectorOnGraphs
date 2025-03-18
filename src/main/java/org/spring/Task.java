package org.spring;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task {
    int n;
    Task next;
    Task prev;
    String log;

    public Task(){}

    public Task(int value,Task next, Task prev) {
        this.n=value;
        this.next = next;
        this.prev = prev;
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
        Task nullTask=new Task(random.nextInt(),null,null);
        graph.add(nullTask);
        for(int i=0;i<taskCount;i++){
            graph.add(new Task(random.nextInt(),graph.get(i-1).next,null));
        }

        return graph;
    }
}
