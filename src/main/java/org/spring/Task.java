package org.spring;

import java.util.List;

public class Task {
    private List<Task> predTaskCollection;
    private List<Task> poslTaskCollection;

    public Task(List<Task> predTaskCollection, List<Task> poslTaskCollection){
        this.predTaskCollection=predTaskCollection;
        this.poslTaskCollection=poslTaskCollection;
    }

    public List<Task> getPredTaskCollection() {
        return predTaskCollection;
    }

    public void setPredTaskCollection(List<Task> predTaskCollection) {
        this.predTaskCollection = predTaskCollection;
    }

    public List<Task> getPoslTaskCollection() {
        return poslTaskCollection;
    }

    public void setPoslTaskCollection(List<Task> poslTaskCollection) {
        this.poslTaskCollection = poslTaskCollection;
    }
}
