package org.spring;

import java.util.List;

public class Task {
    int n;
    Task next;
    Task prev;

    public Task(Task next, Task prev) {
        this.n++;
        this.next = next;
        this.prev = prev;
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
}
