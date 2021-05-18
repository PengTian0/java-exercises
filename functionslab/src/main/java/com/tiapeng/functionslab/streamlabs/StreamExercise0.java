package com.tiapeng.functionslab.streamlabs;


import java.beans.Customizer;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class AnonymousCustomer {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;



    // define required getters/setters, toString()
    // create a constructor to consume any given line from the file could be ...

    public AnonymousCustomer(String s) {
        name = s;
    }
}

public class StreamExercise0 {

    public static void main(String... args) {

        List<AnonymousCustomer> customers = new ArrayList<AnonymousCustomer>();

        for(int i =0; i<10; i++) {
            AnonymousCustomer customer = new AnonymousCustomer("customer" + i);
            customers.add(customer);
        }

        customers.stream().map(customer -> { String alias = customer.getName().concat("123"); return alias;}).forEach(System.out::println);

    }
}
