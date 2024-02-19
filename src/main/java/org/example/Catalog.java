package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Catalog {
    private List<Worker> workers = new ArrayList<>();

    public Catalog(List<Worker> workers) {
        this.workers = workers;
    }

    public void add(Worker worker){
        workers.add(worker);
    }

    public Worker findWorkerById(int id){
        return workers.stream()
                .filter(worker -> id == worker.getId())
                .findFirst()
                .orElseGet(null);
    }

    public List findPhoneByName(String name){
        return workers.stream()
                .filter(worker -> worker.getName().equals(name))
                .map(Worker::getPhoneNumber)
                .collect(Collectors.toList());
    }

    public List<Worker> findWorkerByExperience(int experience){
        return workers.stream()
                .filter(worker -> worker.getExperience() == experience)
                .collect(Collectors.toList());
    }
}
