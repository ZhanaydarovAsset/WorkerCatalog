package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Worker> workers = new ArrayList<>();
        Catalog catalog = new Catalog(workers);
        catalog.add(new Worker(001, "123", "Alex", 2020));
        catalog.add(new Worker(002, "456", "Anna", 2017));
        catalog.add(new Worker(003, "789", "Oleg", 2000));
        catalog.add(new Worker(004, "147", "Dima", 2010));
        catalog.add(new Worker(005, "258", "Vova", 2015));

        System.out.println (catalog.findWorkerByExperience(4));

        System.out.println (catalog.findPhoneByName("Anna"));
        System.out.println (catalog.findWorkerById(005));


    }
}